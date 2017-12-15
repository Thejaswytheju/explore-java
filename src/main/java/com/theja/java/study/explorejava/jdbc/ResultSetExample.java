package com.theja.java.study.explorejava.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ResultSetExample {

    public static void main(String a[]) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.
                    getConnection("jdbc:oracle:thin:@localhost:1521:XE"
                            , "system", "sekhar");
            Statement stmt = con.createStatement();
            System.out.println("Created DB Connection....");
            ResultSet rs = stmt.executeQuery("select employee_id, first_name, last_name from hr.employees");
            int count = 0;
            List<Employee> employees = new ArrayList<Employee>();

            while (rs.next()) {
                Employee e = null;
                e = new Employee();
                e.setId(rs.getLong("employee_id"));
                e.setFirstName(rs.getString("first_name"));
                e.setLastName(rs.getString("last_name"));
                employees.add(e);
            }
            Collections.sort(employees);
            //Collections.sort(employees, new EmployeeLastNameComparator());
            for (Employee employee : employees) {
                count++;
                System.out.println("record: " + count + "-----------------------------");
                System.out.println(employee);
                System.out.println("------------------------------------------------");
            }
            rs.close();
            con.close();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
