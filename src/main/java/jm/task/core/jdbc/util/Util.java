package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_URL="jdbc:mysql://localhost:3306/user";
    private static final String DB_PASSWORD = "06032020Vika";
    private static final String DB_USER = "root";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
