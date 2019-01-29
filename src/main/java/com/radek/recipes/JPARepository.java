package com.radek.recipes;

public abstract class JPARepository<T, K> implements Repository<T, K> {

    private Database database;

    private final Class<T> clazz;

    public JPARepository(Class<T> clazz) {
        this.database = Database.getInstance();
        this.clazz = clazz;
    }

    @Override
    public void add(T t) {
        var entityManager = database.getEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void delete(T t) {

    }

    @Override
    public T findById(K id) {
        var entityManager = database.getEntityManager();
        return entityManager.find(clazz, id);

//        entityManager.getTransaction().begin();
//        pobierania nie jest transakcja więc getTrans..... nie jest potrzebne
//        entityManager.getTransaction().commit();
    }
}
