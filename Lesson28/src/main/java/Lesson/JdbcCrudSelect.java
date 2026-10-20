package Lesson;
import java.sql.*;

public class JdbcCrudSelect {

    public static void main(String[] args) throws SQLException {

        String url = "JDBC:sqlite:comics.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            System.out.println("-- SELECT (First 5)");
            try(Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(
                        "SELECT id, title, author, price " +
                                "FROM comics WHERE price > 10 ORDER BY price, id")) {
                while (rs.next()) {
                    printRow(rs);
                }
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printRow(ResultSet rs) throws SQLException {
        System.out.printf("%2d | %-28s | %-22s | $%.2f\n",
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("author"),
                rs.getDouble("price"));
    }

}
