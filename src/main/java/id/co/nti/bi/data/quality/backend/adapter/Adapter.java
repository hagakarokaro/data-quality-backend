package id.co.nti.bi.data.quality.backend.adapter;

import org.hibernate.QueryException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;
import java.util.Map;

public abstract class Adapter {

    public Connection openConnection(String connection, String username, String password) {
        Connection conn = null;
        try {
            conn =  DriverManager.getConnection(connection, username, password);
            if(conn != null){
                System.out.println("Database Connected");
            } else {
                System.out.println("Connection null");
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public Connection openConnection(Map<String, Object> connection) {
        Connection conn = null;
        String host = (String) connection.get("host");
        String port = (String) connection.get("port");
        String username = (String) connection.get("username");
        String password = (String) connection.get("password");
        String database = (String) connection.get("database");
        try {
            conn =  DriverManager.getConnection("jdbc:postgresql://" + host + ":" + port + "/" + database, username, password);
            if(conn != null){
                conn.setAutoCommit(false);
                System.out.println("Database Connected");
            } else {
                System.out.println("Connection null");
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public ResultSet getData(Map<String, Object> conn, String query){
        try (Connection connection = openConnection(conn);
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()){
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.populate(resultSet);
            return crs;
        } catch (SQLException e) {
            throw new QueryException(e.getMessage());
        }
    }
}
