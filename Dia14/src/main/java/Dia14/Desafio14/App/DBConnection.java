package Dia14.Desafio14.App;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DBConnection {
    private static DBConnection connection;
    private static EntityManagerFactory factory;
    private static EntityManager em;
    
    public static DBConnection getConnection(){
        if(connection == null)
            connection = new DBConnection();
        return connection;
    }
    
    private DBConnection(){
        factory = Persistence.createEntityManagerFactory("Desafio14");
        em = factory.createEntityManager();
    }

    public void persist(Object o){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(o);
        tx.commit();
    }

    public void update(Object object){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(object);
        tx.commit();
    }

    public <T extends Object> T find(Class<T> type, int idx){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        T object = em.find(type, idx);
        tx.commit();
        return object;
    }
    
    public void close(){
        factory.close();
        em.close();
        connection = null;
    }

    public EntityTransaction getEntityTransaction() {
        return em.getTransaction();
    }
}
