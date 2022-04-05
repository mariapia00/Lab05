package it.polito.tdp.anagrammi.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.anagrammi.model.Anagramma;


public class Anagramma {
	
	private List<String> anagrammi;
	
	public List<String> anagramma(String rimanenti) {
		
		anagrammi = new LinkedList<String>();

		anagramma_ricorsiva("", 0, rimanenti);
		
		return anagrammi;
	}
	
	private void anagramma_ricorsiva(String parziale, int livello, String rimanenti) {
		
		if(rimanenti.length()==0) {/*caso terminale*/
			anagrammi.add(parziale);
			return ;
		
		}else {
			for(int pos = 0; pos<rimanenti.length(); pos++) {
				String nuova_parziale = parziale+rimanenti.charAt(pos);
				String nuova_rimanenti = rimanenti.substring(0, pos)+rimanenti.substring(pos+1);
				anagramma_ricorsiva(nuova_parziale, livello+1, nuova_rimanenti);
			}
		}
	}
	
	
}
