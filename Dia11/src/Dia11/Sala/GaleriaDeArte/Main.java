package Dia11.Sala.GaleriaDeArte;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("GaleriaPU2");
        EntityManager em = factory.createEntityManager();
        
        Obra obra = new Obra();
        obra.setAutor("Adir");
        obra.setDataObra(parseData("12/12/2012"));
        obra.setDimensoes("12cm x 12cm");
        obra.setProcedencia("Sim");
        obra.setTecnica("Óleo");
        obra.setTipo("Quadrado");
        obra.setTitulo("Obra");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(obra);
        tx.commit();
        em.close();
        factory.close();
    }
    
    public static Calendar parseData(String data){
        try {
            Date date = new SimpleDateFormat("dd/mm/yyyy").parse(data);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
    