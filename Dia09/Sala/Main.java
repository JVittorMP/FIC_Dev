package Dia09.Sala;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static Logger log;
    
    public static void main(String[] args) {
        log = Logger.getLogger(Main.class.getName());
        
        log.log(Level.WARNING, "AVISO!");
        log.log(Level.INFO, "+ Informações");
    }

}
