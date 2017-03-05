/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ece.donnaint.guoi.exo2.controller;

import fr.ece.donnaint.guoi.exo2.ApplicationJavaFX2;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author nicolas, kevin
 */
public class UserListController implements Initializable {
    private ApplicationJavaFX2 main;
    
    @FXML
    private ListView userLV;
    
    @FXML
    private TextField addUserText;

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
    }  
    
    //Set userList to ListView
    public void show(){
        userLV.setItems(FXCollections.observableArrayList(main.getUserList().getData()));
    }

    //Update views on action
    @FXML
    public void updateView() {
        //update data
        this.main.getUserList().addUser(addUserText.getText());
        //update userlist
        this.show();//update CLI
        this.main.getCli().threads();
    }
}
