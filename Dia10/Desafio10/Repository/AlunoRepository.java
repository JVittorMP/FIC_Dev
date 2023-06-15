package Dia10.Desafio10.Repository;

import Dia10.Desafio10.Classes.Aluno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepository implements Repository<Aluno> {

    @Override
    public void insert(Aluno object) {
        try(Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO Aluno(Nome, Email, Idade) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, object.getNome());
            ps.setString(2, object.getEmail());
            ps.setInt(3, object.getIdade());
            ps.executeUpdate();
            ps.close();
        } catch(SQLException E) {
            System.out.println(E.getMessage());
        }
    }

    @Override
    public void update(Aluno object) {
        try(Connection conn = DBConnection.getConnection()) {
            String sql = "UPDATE Aluno SET Nome = ?, Email = ?, Idade = ? WHERE Matricula = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, object.getNome());
            ps.setString(2, object.getEmail());
            ps.setInt(3, object.getIdade());
            ps.setInt(4, object.getMatricula());
            ps.executeUpdate();
            ps.close();
        } catch(SQLException E) {
            System.out.println(E.getMessage());
        }
    }

    @Override
    public void delete(Aluno object) {
        try(Connection conn = DBConnection.getConnection()) {
            String sql = "DELETE FROM Aluno WHERE Matricula = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, object.getMatricula());
            ps.executeUpdate();
            ps.close();
        } catch(SQLException E) {
            System.out.println(E.getMessage());
        }
    }

    @Override
    public Aluno get(int idx){
        try(Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM Aluno WHERE Matricula = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idx);
            ResultSet rs = ps.executeQuery(); rs.next();
            Aluno novo = new Aluno(rs.getInt("Matricula"), rs.getString("Nome"), rs.getString("Email"), rs.getInt("Idade"));
            ps.close();
            rs.close();
            return novo;
        } catch(SQLException E) {
            System.out.println(E.getMessage());
        }
        
        return null;
    }

    @Override
    public List<Aluno> select() {
        try(Connection conn = DBConnection.getConnection()) {
            List<Aluno> lista = new ArrayList<>();
            String sql = "SELECT * FROM Aluno";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Aluno novo = new Aluno(rs.getInt("Matricula"), rs.getString("Nome"), rs.getString("Email"), rs.getInt("Idade"));
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
