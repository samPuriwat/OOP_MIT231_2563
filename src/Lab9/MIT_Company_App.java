package Lab9;

import java.sql.*;
import java.util.ArrayList;

public class MIT_Company_App {

    public static void main(String[] args) {
        // step 1: Load Driver
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Load Driver Successfully.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //step 2: Create Connection to DB
        ArrayList<Employee> myEmp = new ArrayList<Employee>();
        String SQCONN = "jdbc:sqlite:MIT_Company.sqlite";

        try {
            Connection conn = DriverManager.getConnection(SQCONN);
            if (conn == null) {
                System.out.println("Could not connect to database.");
            }else {
                System.out.println("Connected to database.");
            }
        //step 3: Create Statement
            Statement stmt = conn.createStatement();
            String sql = "select * from employee";
            ResultSet rs = stmt.executeQuery(sql);

        //step 4: Display data from database
            if (rs == null) {
                System.out.println("Database is empty.");
            }else {

                while (rs.next()) {
                    Employee emp = new Employee(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getDouble(4));
                    myEmp.add(emp); //store object to arraylist
                }
            }
        //step 5: Display data as object
            System.out.println("Data from database: ");
            for (Employee e:myEmp) {
                System.out.println(e.toString());
            }
            //close connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//main
}//class
