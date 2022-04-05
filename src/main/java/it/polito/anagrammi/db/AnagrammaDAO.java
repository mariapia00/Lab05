package it.polito.anagrammi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnagrammaDAO {

	
	// controllo se la parola è presente nel database
	
	public boolean isCorrect(String anagramma) {
		
		String sql = "SELECT nome FROM parola WHERE nome=?";
		
		boolean result;
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1,anagramma);
			ResultSet rs = st.executeQuery();//esegue una riga per volta
	
			if(rs.next()) {
				result = true;
			}else {
				result = false;
			}
			st.close();
			rs.close();
			conn.close();
			return result;
		}catch(SQLException e) {
			System.err.println("Errore nel DAO");
			e.printStackTrace();
			return false;
		}
	}
}
