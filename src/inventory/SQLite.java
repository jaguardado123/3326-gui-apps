package inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class SQLite implements Database {
    
    // SQLite attributes
    private Connection connect = null; // connects to database 
    private Statement statement = null; // executes/runs queries

    // Connect to our database
    private void connectDatabase() {

    }

    // Write into our database.
    @Override 
    public void updateDatabase(String query) {

    }

    // Read from our database.
    @Override
    public Object[] readDatabase(String query) {
        return new Object[] {};
    }
}
