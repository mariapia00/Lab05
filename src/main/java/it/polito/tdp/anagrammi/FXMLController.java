/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private Model model;
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtAnagrammiCorretti"
    private TextArea txtAnagrammiCorretti; // Value injected by FXMLLoader

    @FXML // fx:id="txtAnagrammiErrati"
    private TextArea txtAnagrammiErrati; // Value injected by FXMLLoader

    @FXML // fx:id="txtdaAnagrammare"
    private TextField txtdaAnagrammare; // Value injected by FXMLLoader

    @FXML
    void handleCalcolaAnagramma(ActionEvent event) {
    	String daAnagrammare = txtdaAnagrammare.getText();
    	List<String> result = this.model.anagramma(daAnagrammare);
    	for(String s : result) {
    		if(this.model.isCorrect(s))
    			txtAnagrammiCorretti.appendText(s+"\n");
    		else{
    			txtAnagrammiErrati.appendText(s+"\n");
    		}
    	}
   }

    @FXML
    void handleReset(ActionEvent event) {
    	txtAnagrammiErrati.clear();
    	txtAnagrammiCorretti.clear();
    	txtdaAnagrammare.clear();
    }

    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtAnagrammiCorretti != null : "fx:id=\"txtAnagrammiCorretti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtAnagrammiErrati != null : "fx:id=\"txtAnagrammiErrati\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtdaAnagrammare != null : "fx:id=\"txtdaAnagrammare\" was not injected: check your FXML file 'Scene.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
		
	}


}
