package com.soft.java.myEnum;

public enum DataSourceEnum {
    DATASOURCE;
    private final DbConnection connection;

    DataSourceEnum() {
        connection = new DbConnection();
    }

    public DbConnection getConnection() {
        return connection;
    }

    static class DbConnection {
        private DbConnection() {

        }
    }
}
