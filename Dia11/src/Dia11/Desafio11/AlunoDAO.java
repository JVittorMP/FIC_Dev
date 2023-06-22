package Dia11.Desafio11;

import java.util.List;

public class AlunoDAO {
    
    public void create(Aluno objeto){
        DBConnection.getConnection().persist(objeto);
    }
    
    public Aluno read(int id){
        return DBConnection.getConnection().find(Aluno.class,id);
    }
    
    public void update(Aluno objeto){
        DBConnection.getConnection().merge(objeto);
    }
    
    public void delete (Aluno objeto){
        DBConnection.getConnection().remove(objeto);
    }
    
    public List<Aluno> readAll(){
        return DBConnection.getConnection().findAll(Aluno.class);
    }
}
