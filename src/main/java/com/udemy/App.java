package com.udemy;

/**
 *
 * @author Jan
 */
public class App {
    public static void main(String[] args) {
        StudentJDBCQuery jdbcQuery = new StudentJDBCQuery();
        jdbcQuery.readDatabase();
    }

}
