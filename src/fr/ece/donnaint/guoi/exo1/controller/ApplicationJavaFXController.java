/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ece.donnaint.guoi.exo1.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 *
 * @author nicolas, kevin
 */
public class ApplicationJavaFXController implements Initializable {
    
    @FXML
    private Button buttonToConsole;
    
    @FXML
    private TextArea textAreaToSend;
    
    //Button, onclick <- event we catch
    @FXML
    public void sendToConsole() {
        System.out.println(textAreaToSend.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}
