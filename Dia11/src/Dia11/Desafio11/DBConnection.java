package Dia11.Desafio11;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DBConnection {
    private static DBConnection conexao;
    private static EntityManagerFactory factory;
    private static EntityManager em;
    
    private DBConnection(){
        factory = Persistence.createEntityManagerFactory("Desafio11");
        em = factory.createEntityManager();
    }
    
    public static DBConnection getConnection(){
        if(conexao == null)
            conexao = new DBConnection();
        return conexao;
    }
    
    public void persist(Object o){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(o);
        tx.commit();
    }
    
    public <T extends Object> T find(Class<T> type, Object o){
        return em.find(type, o);
    }
    
    public void remove(Object o){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(o);
        tx.commit();
    }
    
    public void merge(Object o){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(o);
        tx.commit();
    }
    
    public <T extends Object> List<T> findAll(Class<T> type) {
        Query query = em.createQuery("FROM " + type.getName() + " ORDER BY ID");
        return query.getResultList();
    }
    
    public void close(){
        em.close();
        factory.close();
        conexao = null;
    }
}
