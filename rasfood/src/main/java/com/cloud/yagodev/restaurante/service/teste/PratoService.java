package com.cloud.yagodev.restaurante.service.teste;

import com.cloud.yagodev.restaurante.dao.PratoDAO;
import com.cloud.yagodev.restaurante.entity.Prato;
import com.cloud.yagodev.restaurante.util.JPAUtil;
import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class PratoService {
    public static void main(String[] args) {

        Prato risoto = new Prato();
        risoto.setNome("Risoto de frutos do Mar");
        risoto.setDescricao("Risoto acompanhado de lula, polvo e mariscos");
        risoto.setDisponivel(true);
        risoto.setValor(BigDecimal.valueOf(88.50));


        EntityManager entityManager = JPAUtil.entityManager();
        PratoDAO pratoDAO = new PratoDAO(entityManager);

        entityManager.getTransaction().begin();
        pratoDAO.cadastrar(risoto);
        entityManager.getTransaction().commit();
        entityManager.clear();
    }
}
