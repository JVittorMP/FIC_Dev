package Dia10.Desafio10.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dia10.Desafio10.Classes.Escola;

public class EscolaRepository implements Repository<Escola> {

    @Override
    public void insert(Escola object) {
        try(Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO Escola(Nome, Capacidade) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, object.getNome());
            ps.setInt(2, object.getCapacidade());
            ps.executeUpdate();
            ps.close();
        } catch(SQLException E) {
            System.out.println(E.getMessage());
        }
    }

    @Override
    public void update(Escola object) {
        try(Connection conn = DBConnection.getConnection()) {
            String sql = "UPDATE Escola SET Nome = ?, Capacidade = ? WHERE Codigo = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, object.getNome());
            ps.setInt(2, object.getCapacidade());
            ps.setInt(3, object.getCodigo());
            ps.executeUpdate();
            ps.close();
        } catch(SQLException E) {
            System.out.println(E.getMessage());
        }
    }

    @Override
    public void delete(Escola object) {
        try(Connection conn = DBConnection.getConnection()) {
            String sql = "DELETE FROM Escola WHERE Codigo = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, object.getCodigo());
            ps.executeUpdate();
            ps.close();
        } catch(SQLException E) {
            System.out.println(E.getMessage());
        }
    }

    @Override
    public Escola get(int idx){
        try(Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM Escola WHERE Codigo = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idx);
            ResultSet rs = ps.executeQuery(); rs.next();
            Escola novo = new Escola(rs.getInt("Codigo"), rs.getString("Nome"), rs.getInt("Capacidade"));
            ps.close();
            rs.close();
            return novo;
        } catch(SQLException E) {
            System.out.println(E.getMessage());
        }
        
        return null;
    }

    @Override
    public List<Escola> select() {
        try(Connection conn = DBConnection.getConnection()) {
            List<Escola> lista = new ArrayList<>();
            String sql = "SELECT * FROM Escola";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Escola novo = new Escola(rs.getInt("Codigo"), rs.getString("Nome"), rs.getInt("Capacidade"));
                lista.add(novo);
            }
            ps.close();
            rs.close();
            return lista;
        } catch(SQLException E) {
            System.out.println(E.getMessage());
        }

        return null;
    }
    
}
