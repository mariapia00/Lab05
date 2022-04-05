package it.polito.anagrammi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static Connection getConnection() {
		try{
			String url = "jdbc:mysql://localhost/dizionario?user=root&password=rootroot";
			return DriverManager.getConnection(url);
		}catch(SQLException e) {
			System.err.println("Errore di connessione.");
			e.printStackTrace();
			return null;
		}
	}
}
