/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ece.donnaint.guoi.exo2.controller;

import fr.ece.donnaint.guoi.exo2.ApplicationJavaFX2;
import fr.ece.donnaint.guoi.exo2.model.Model;
import fr.ece.donnaint.guoi.exo2.model.UserList;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nicolas
 */
public class UserListController implements Initializable {
    private ApplicationJavaFX2 main;
    
    @FXML
    private ListView userLV;

    public UserListController() {
        
    }

    public void setMain(ApplicationJavaFX2 main) {
        this.main = main;
    }
      
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
    }  
    
    public void show(){
        userLV.setItems(FXCollections.observableArrayList(main.getUserList().getData()));
    }

    
}
