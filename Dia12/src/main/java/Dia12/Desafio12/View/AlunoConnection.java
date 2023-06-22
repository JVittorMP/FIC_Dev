package Dia12.Desafio12.View;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dia12.Desafio12.Model.Aluno;

public class AlunoConnection {
    private static AlunoConnection conexao;
    private static EntityManagerFactory factory;
    private static EntityManager em;
    
    private AlunoConnection(){
        factory = Persistence.createEntityManagerFactory("Desafio12");
        em = factory.createEntityManager();
    }
    
    public static AlunoConnection getConnection(){
        if(conexao == null)
            conexao = new AlunoConnection();
        return conexao;
    }
    
    public void persist(Aluno aluno){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(aluno);
        tx.commit();
    }
    
    public Aluno find(int id){
        return em.find(Aluno.class, id);
    }
    
    public void remove(Aluno aluno){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(aluno);
        tx.commit();
    }
    
    public void merge(Aluno aluno){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(aluno);
        tx.commit();
    }
    
    public List<Aluno> findAll() {
        Query query = em.createQuery("FROM Aluno ORDER BY ID");
        return query.getResultList();
    }
    
    public void close(){
        em.close();
        factory.close();
        conexao = null;
    }
}
