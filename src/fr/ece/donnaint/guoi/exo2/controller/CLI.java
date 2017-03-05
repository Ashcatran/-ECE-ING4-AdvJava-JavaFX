/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ece.donnaint.guoi.exo2.controller;

import fr.ece.donnaint.guoi.exo2.ApplicationJavaFX2;
import java.util.ArrayList;
import javafx.concurrent.Task;

/**
 *
 * @author nicolas, kevin
 */
public class CLI {
    private ApplicationJavaFX2 main;
    
    public void setMain(ApplicationJavaFX2 main) {
        this.main = main;
    }
    
    //Displays the UserList in the console, using a different Thread
    public void threads() {
        Task task = new Task<ArrayList<String>>() {
            @Override
            public ArrayList<String> call() {
                ArrayList<String> items = main.getUserList().getData();
                items.forEach((item) -> {
                    System.out.println(item);
                });
                System.out.println("----------");
                return items;
            }
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
