import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "passwordhere");
            Statement stmt = connection.createStatement();
            stmt.execute("ALTER TABLE students ADD country VARCHAR(30)");
            stmt.execute("UPDATE students SET country=\"Italy\"WHERE student_id<=2;");
            stmt.execute("UPDATE students SET country= \"Gernamy\" WHERE student_id>2 AND student_id <=4;");
            //perchè senza il \"nome\" non prende il nome della tabella????
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
