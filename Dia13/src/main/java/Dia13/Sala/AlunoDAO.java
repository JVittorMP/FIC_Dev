package Dia13.Sala;

import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AlunoDAO {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        Aluno aluno = new Aluno();
        aluno.setNome(" Fernanda ");
        Transaction transaction = session.beginTransaction();
        session.persist(aluno);
        transaction.commit();

        TypedQuery<Aluno> query = session.createQuery(" FROM Aluno ", Aluno.class);
        List<Aluno> alunos = query.getResultList();
        for (Aluno n : alunos) {
            System.out.println(n.getNome());
        }
        
        session.close();
    }
}
