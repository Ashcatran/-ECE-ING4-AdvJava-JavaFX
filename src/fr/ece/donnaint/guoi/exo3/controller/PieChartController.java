/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ece.donnaint.guoi.exo3.controller;

import fr.ece.donnaint.guoi.exo3.ApplicationJavaFX3;
import fr.ece.donnaint.guoi.exo3.majorModel.Major;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

/**
 * FXML Controller class
 * Conroller for the pie chart and the table
 * @author nicolas, kevin
 */
public class PieChartController implements Initializable {
    
    @FXML
    private PieChart pieChart;
    
    @FXML
    private TableColumn<Major, String> majorColumn;
    
    @FXML
    private TableColumn<Major, String> numberColumn;
    
    @FXML
    private TableView<Major> tableData;
    
    private ApplicationJavaFX3 main;
    
    //set initialization values to field main, and tableView and PieChart
    public void setMain(ApplicationJavaFX3 main) {
        this.main = main;
        this.tableData.setItems(this.main.getMajorData());
        this.setPieChartData();
    }
    

    public PieChartController() {
        
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //set the data into the table
        //set major column cell data from major field name
        this.majorColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        this.majorColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        //Action on Edit
        this.majorColumn.setOnEditCommit((TableColumn.CellEditEvent<Major, String> changedName) -> {
            ((Major) changedName.getTableView().getItems().get(changedName.getTablePosition().getRow())).setName(changedName.getNewValue());
            setPieChartData();
        });
        
        //set number of students column cell data from major field numberOfStudents
        this.numberColumn.setCellValueFactory(new PropertyValueFactory<>("numberOfStudents"));
        this.numberColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        //action on edit
        this.numberColumn.setOnEditCommit((TableColumn.CellEditEvent<Major, String> changedName) -> {
            ((Major) changedName.getTableView().getItems().get(changedName.getTablePosition().getRow())).setNumberOfStudents(changedName.getNewValue());
            setPieChartData();
        });
        
        pieChart.setTitle("ECE Students repartition by major - 2017");

    }
    
    //Updates the pie Chart values to the data stored into majorData
    public void setPieChartData(){
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
        for(Major major:this.main.getMajorData()){
            pieChartData.add(new PieChart.Data(major.getName(), Integer.parseInt(major.getNumberOfStudents())));
        }
        pieChart.setData(pieChartData);
        
    }
    
    
    


}
