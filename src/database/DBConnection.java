  
        package database;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;

public class DBConnection {

    static String url =
            "jdbc:mysql://localhost:3306/money_management";

    static String username = "root";

    static String password = "root";

    public static Connection con() {

        try {

            Class.forName(
                    "com.mysql.cj.jdbc.Driver"
            );

            Connection connection =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            System.out.println(
                    "Database connected successfully!"
            );

            return connection;

        } catch (Exception e) {

            System.out.println(
                    "Database connection failed!"
            );

            e.printStackTrace();

            return null;
        }
    }

    public static void main(String[] args) {

        con();

    }
}

