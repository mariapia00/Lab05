package it.polito.tdp.anagrammi.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.anagrammi.db.AnagrammaDAO;

public class Model {
	
	private Anagramma anagramma;
	private AnagrammaDAO anagrammaDAO;
	public Model() {
		anagramma = new Anagramma();
		anagrammaDAO = new AnagrammaDAO();
	}
	public List<String> anagramma(String rimanenti) {
		
		return anagramma.anagramma(rimanenti);
	}
	public boolean isCorrect(String s) {
		return this.anagrammaDAO.isCorrect(s);
	}
}
