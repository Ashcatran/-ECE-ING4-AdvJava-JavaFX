/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ece.donnaint.guoi.exo3.majorModel;

/**
 * Major Class, contains name and number of students
 * @author Nicolas, Kevin
 */
public class Major {
    private String name;
    private String numberOfStudents;

    public Major(String name, String numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfStudents() {
        return numberOfStudents;
    }
    
    public void setNumberOfStudents(String numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    
    
    
}
