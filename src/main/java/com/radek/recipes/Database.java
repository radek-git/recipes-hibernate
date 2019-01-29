package com.radek.recipes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Database {

    private static Database instance;
    private static EntityManagerFactory entityManagerFactory;

    private Database() {
        entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }

        return instance;
    }

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }


}
