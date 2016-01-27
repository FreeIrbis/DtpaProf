/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpraprof;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Irbis
 */
public class LoginController implements Initializable {
           
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("General.fxml"));
        System.out.println("You clicked me!");
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
          }
    
  
