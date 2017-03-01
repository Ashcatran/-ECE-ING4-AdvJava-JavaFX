/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ece.donnaint.guoi.exo3.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nicolas
 */
public class PieChartController implements Initializable {
    
    @FXML
    private PieChart pieChart;

    public PieChartController() {
        
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("SI", 120),
                new PieChart.Data("SE", 150),
                new PieChart.Data("SA", 30),
                new PieChart.Data("OCRES", 30),
                new PieChart.Data("ENE", 130),
                new PieChart.Data("FI", 50));
        pieChart.setTitle("ECE Students repartition by major - 2017");
        pieChart.setData(pieChartData);
    }    

}
