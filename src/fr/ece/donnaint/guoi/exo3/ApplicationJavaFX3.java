/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ece.donnaint.guoi.exo3;

import fr.ece.donnaint.guoi.exo3.controller.PieChartController;
import fr.ece.donnaint.guoi.exo3.majorModel.Major;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author nicolas
 */
public class ApplicationJavaFX3 extends Application {
    
    private final ObservableList<Major> majorData = FXCollections.observableArrayList();

    public ObservableList<Major> getMajorData() {
        return majorData;
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        //initial values
        majorData.add(new Major("SI", "120"));
        majorData.add(new Major("SE", "150"));
        majorData.add(new Major("SA", "30"));
        majorData.add(new Major("OCRES", "30"));
        majorData.add(new Major("ENE", "130"));
        majorData.add(new Major("FI", "50"));
        
        //FXML initialization
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ApplicationJavaFX3.class.getResource("view/PieChartView.fxml"));
        AnchorPane rootLayout = loader.load();
        
        //Controller initialization
        PieChartController userController = loader.getController();
        userController.setMain(this);
        
        //Display in new window
        Scene scene = new Scene(rootLayout, 800, 600);
        stage.setTitle("JavaFX exo3 - modifiable pie chart");
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
