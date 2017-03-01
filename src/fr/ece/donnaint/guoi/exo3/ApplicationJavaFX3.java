/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ece.donnaint.guoi.exo3;

import fr.ece.donnaint.guoi.exo3.controller.PieChartController;
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
public class ApplicationJavaFX3 extends Application {
    
    
    @Override
    public void start(Stage stage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("view/UserListView.fxml"));
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ApplicationJavaFX3.class.getResource("view/PieChartView.fxml"));
        AnchorPane rootLayout = loader.load();
        
        PieChartController userController = loader.getController();
        Scene scene = new Scene(rootLayout, 800, 600);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
