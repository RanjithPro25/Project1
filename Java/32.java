import java.sql.*;

class StudentDAO {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "password");

        PreparedStatement ps =
                con.prepareStatement(
                        "INSERT INTO students VALUES(?,?)");

        ps.setInt(1, 1);
        ps.setString(2, "Alice");
        ps.executeUpdate();

        PreparedStatement ps2 =
                con.prepareStatement(
                        "UPDATE students SET name=? WHERE id=?");

        ps2.setString(1, "Bob");
        ps2.setInt(2, 1);
        ps2.executeUpdate();

        con.close();
    }
}