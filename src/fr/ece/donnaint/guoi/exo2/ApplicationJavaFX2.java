/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ece.donnaint.guoi.exo2;

import fr.ece.donnaint.guoi.exo2.controller.CLI;
import fr.ece.donnaint.guoi.exo2.controller.UserListController;
import fr.ece.donnaint.guoi.exo2.model.UserList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author nicolas
 */
public class ApplicationJavaFX2 extends Application {
    
    private UserList userList;

    public ApplicationJavaFX2() {        
    }

    public UserList getUserList() {
        return userList;
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        this.userList = new UserList();
        this.userList.addUser("Kevin");
        this.userList.addUser("Nicolas");
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ApplicationJavaFX2.class.getResource("view/UserListView.fxml"));
        AnchorPane rootLayout = loader.load();
        
        UserListController userController = loader.getController();
        userController.setMain(this);
        
        
        
        Scene scene = new Scene(rootLayout, 800, 600);
        
        stage.setScene(scene);
        stage.show();
        
        CLI cli = new CLI();
        cli.setMain(this);
        cli.threads();
        userController.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
