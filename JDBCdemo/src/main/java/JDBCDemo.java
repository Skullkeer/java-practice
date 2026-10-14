import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) {

        String url = "jdbc:h2:mem:school";

        try (Connection conn =
                     DriverManager.getConnection(url, "sa", "")) {

            // 1. Create a table
            Statement stmt = conn.createStatement();

            stmt.executeUpdate(
                    "CREATE TABLE students (" +
                            "id INT PRIMARY KEY, " +
                            "name VARCHAR(50))"
            );

            // 2. Insert data
            stmt.executeUpdate(
                    "INSERT INTO students VALUES (1, 'Alice')"
            );

            stmt.executeUpdate(
                    "INSERT INTO students VALUES (2, 'Bob')"
            );

            // 3. Retrieve data
            ResultSet results = stmt.executeQuery(
                    "SELECT * FROM students"
            );

            // 4. Display results
            while (results.next()) {
                System.out.println(
                        results.getInt("id") + " " +
                                results.getString("name")
                );
            }

            results.close();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}