/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selective.repeat;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import static selective.repeat.SelectiveRepeat.MAINSTAGE;

/**
 * FXML Controller class
 *
 * @author Uchiha Tobi
 */
public class DataEntryController implements Initializable {

    @FXML
    private Button sim;
    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
public static int sqlimit=0;
public static int windowsz=0;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         sim.setStyle("-fx-background-color: transparent; -fx-background-radius: 10;");
         
    }    

    @FXML
    private void simulate(ActionEvent event) {
             
        sqlimit=Integer.parseInt(txt1.getText());
         windowsz=Integer.parseInt(txt2.getText());
         if(windowsz>Math.pow(2, sqlimit)/2)
           JOptionPane.showMessageDialog(null,"Window size must be at most half the size of different sequence numbers","Wrong input",1);
         else{
         try {
            Parent root;
            root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
        SelectiveRepeat.MAINSTAGE.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(DataEntryController.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
        
    }
    
}
