package com.cloud.yagodev.restaurante.dao;

import com.cloud.yagodev.restaurante.entity.Prato;

import javax.persistence.EntityManager;

public class PratoDAO {

    private EntityManager entityManager;

    public PratoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void cadastrar(Prato prato) {
        entityManager.persist(prato);
        System.out.println(prato);
    }
}
