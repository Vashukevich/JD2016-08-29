package by.it.senchenko.project.java;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CN {
    public static final String URL_DB = "jdbc:mysql://127.0.0.1:2016/senchenko"+
                                        "?useUnicode=true&amp;characterEncoding=UTF-8";
    public static final String USER_DB = "root";
    public static final String PASSWORD_DB = "";

    private static volatile Connection connection = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //DriverManager.registerDriver(new FabricMySQLDriver());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed())
            connection = DriverManager.getConnection(
                    URL_DB, USER_DB, PASSWORD_DB
            );
        return connection;
    }
}

