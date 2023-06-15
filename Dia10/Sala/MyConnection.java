package Dia10.Sala;

import java.sql.*;

public class MyConnection {
    public static void main(String[] args) {
        try {
            // Registro do Driver e Abertura de Conexão
            Class.forName("org.postgresql.Driver"); 
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ficdatabase","usuario", "senha");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM escola");
            while (rs.next()) {
                int id = rs.getInt("IDEscola");
                String nome = rs.getString("NomeEscola");
                System.out.println(id + ", "+ nome );
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Erro: "+ e.getMessage());
        } 
    } 
}
