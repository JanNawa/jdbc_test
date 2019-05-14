package com.udemy;

import java.sql.*;

/**
 *
 * @author Jan
 */
public class StudentJDBCQuery {
    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private String DATABASE_URL = "jdbc:mysql://localhost/udemy_java_ee";
    private String USER = "username";
    private String PASSWORD = "password";
    
    public void readDatabase() {

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
                Statement statement = connection.createStatement();) {
            
            String sql = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                
                Student student = new Student(id, name, age);
                System.out.println(student);
            }
        } catch (Exception e) {
            System.out.println("Error reading database");
        }
    }

}
