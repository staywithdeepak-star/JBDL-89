import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        /**
         * We need to create a table 'user' in let's suppose some database 'usersdb'
         * MySQL :
         * Other Relational Databases like Postgres, SQL Server, Oracle, H2, ...
         *
         * http - hypertext transfer protocol
         * smtp - simple mail transfer protocol
         *
         * jdbc - java database connectivity (used to connect java application to sql / relational dbs)
         *
         * mysql - 3306
         * postgres - 5432
         *
         *
         */
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jbdl89_usersdb", "root", "");
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE attendance(id int, username varchar(255))");

            System.out.println("Table created");
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Unable to connect to database");
        }
        System.out.println("Connected to database successfully");
    }
}