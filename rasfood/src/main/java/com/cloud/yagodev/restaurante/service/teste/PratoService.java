package com.cloud.yagodev.restaurante.service.teste;

import com.cloud.yagodev.restaurante.entity.Prato;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class PratoService {
    public static void main(String[] args) {

        Prato risoto = new Prato();
        risoto.setNome("Risoto de frutos do Mar");
        risoto.setDescricao("Risoto acompanhado de lula, polvo e mariscos");
        risoto.setDisponivel(true);
        risoto.setValor(BigDecimal.valueOf(88.50));

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rasFood");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(risoto);
        entityManager.getTransaction().commit();
        entityManager.clear();
    }
}
