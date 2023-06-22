package Dia13.Desafio13;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.TypedQuery;

public class MusicaDAO {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("desafio.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        Musica musica = new Musica();
        musica.setAutor("Hikaru Utada");
        musica.setTitulo("気分じゃないの");
        Transaction transaction = session.beginTransaction();
        session.persist(musica);
        transaction.commit();

        TypedQuery<Musica> query = session.createQuery(" FROM Musica ", Musica.class);
        List<Musica> musicas = query.getResultList();
        for (Musica n : musicas) {
            System.out.println(n.getAutor() + ": " + n.getTitulo());
        }
        
        session.close();
    }
}
