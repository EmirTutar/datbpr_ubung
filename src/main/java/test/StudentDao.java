package test;

import java.sql.*;

public class StudentDao {
    private final String url;
    private final String username;
    private final String password;

    public StudentDao() {
        url = "jdbc:mysql://localhost:3306/DPGD_1";
        username = "root";
        password = "my_secret_password";
    }

    public StudentTO readStudentByMatNr(int matNr) {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM students WHERE mat_nr = ?");
            stmt.setInt(1, matNr);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new StudentTO(
                        rs.getInt("mat_nr"),
                        rs.getString("first_name"),
                        rs.getString("last_name")
                );
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new DaoExeption("Error", e);
        }
        return null;
    }
}
