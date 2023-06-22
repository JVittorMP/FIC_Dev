package Dia14.Sala;

import java.sql.*;
import javax.sql.DataSource;

public class StudentDao {
    private DataSource ds;

    public void setDataSource(DataSource ds) {
        this.ds = ds;
    }

    public Student findByNameStudent(String string) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ds.getConnection();
            ps = con.prepareStatement("select * from estudante where nome_estudante =  ?");
            ps.setString(1, string);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Student stud = new Student();
                stud.setID(rs.getInt("id"));
                stud.setName(rs.getString("nome"));
                stud.setCity(rs.getString("cidade"));
                return stud;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
