import java.sql.*;

class TransactionDemo {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "password");

        con.setAutoCommit(false);

        try {
            Statement st = con.createStatement();

            st.executeUpdate(
                "UPDATE accounts SET balance=balance-100 WHERE id=1");

            st.executeUpdate(
                "UPDATE accounts SET balance=balance+100 WHERE id=2");

            con.commit();
            System.out.println("Transfer Success");
        }
        catch(Exception e) {
            con.rollback();
            System.out.println("Rollback");
        }

        con.close();
    }
}