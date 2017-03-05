/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ece.donnaint.guoi.exo2.model;

import java.util.ArrayList;

/**
 *
 * @author nicolas, kevin
 */
public class UserList implements Model {

    private final ArrayList<String> data;

    public UserList() {
        this.data = new ArrayList<>();
    }

    public UserList(ArrayList<String> data) {
        this.data = data;
    }
    
    //adds a user to the UserList
    public ArrayList<String> addUser(String user) {
        this.data.add(user);
        return this.data;
    }

    @Override
    public ArrayList<String> getData() {
        return this.data;
    }
}
