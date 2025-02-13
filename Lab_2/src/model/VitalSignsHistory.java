/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author krish
 */
public class VitalSignsHistory {
    ArrayList<VitalSigns>history;
    
    public VitalSignsHistory(){
        history =  new ArrayList<VitalSigns>(); //constructor
    }
    
    public VitalSigns addNewVitals(){
        VitalSigns newVs = new VitalSigns(); //method 1 to add 
        history.add(newVs);
        return newVs;
        
    }
    
    public void removeVitals(VitalSigns vs){
       history.remove(vs);   //method 2 to delete
       
    }
    public ArrayList<VitalSigns> getHistory(){
        return history;
    }
}
