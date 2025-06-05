package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/firstLesson";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "84273823263";
    public Connection getConnection () {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e ) {
            e.printStackTrace();
            throw new RuntimeException("Ошибка подключения к БД");
        }
    }
}
