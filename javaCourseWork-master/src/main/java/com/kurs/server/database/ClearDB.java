package com.kurs.server.database;

import org.apache.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClearDB {
    private static final Logger serverLogger = Logger.getLogger("server");

    public ClearDB() {
        String request = "DELETE FROM main_menu";
        try {
            PreparedStatement statement = new DBConnection().getConnection().prepareStatement(request);
            statement.executeUpdate();
            serverLogger.info("Меню очищено :(");
        } catch (SQLException e) {
            serverLogger.error("Меню не было очищено,ошибка " + e.getMessage());
        }
    }
}
