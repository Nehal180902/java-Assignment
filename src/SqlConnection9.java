import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SqlConnection9 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "Nehalt@180902";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            String insertQuery = "INSERT INTO students (id, name, age) VALUES (" + id + ", '" + name + "', " + age + ")";
            stmt.executeUpdate(insertQuery);
            System.out.println("✅ Record inserted successfully!");

            String selectQuery = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("\nID\tName\tAge");
            while (rs.next()) {
                int sid = rs.getInt("id");
                String sname = rs.getString("name");
                int sage = rs.getInt("age");
                System.out.println(sid + "\t" + sname + "\t" + sage);
            }

            rs.close();
            stmt.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
