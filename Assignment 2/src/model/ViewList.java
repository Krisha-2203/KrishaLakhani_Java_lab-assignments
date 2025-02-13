/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author krish
 */
public class ViewList {
    
    private String FirstName;
    private String LastName;
    private String HCity;
    private String WCity;
    private String HZipCode;
    private String WZipCode;

 

    public ViewList (String FirstName, String LastName, String HCity, String WCity, String HZipCode, String WZipCode)
    {
     this.FirstName = FirstName;
     this.LastName = LastName;
     this.HCity = HCity;
     this.WCity = WCity;
     this.HZipCode = HZipCode;
     this.WZipCode = WZipCode;
             
    }
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
   public String getHCity() {
        return HCity;
    }

    public void setHCity(String HCity) {
        this.HCity = HCity;
    }

    public String getWCity() {
        return WCity;
    }

    public void setWCity(String WCity) {
        this.WCity = WCity;
    }

    public String getHZipCode() {
        return HZipCode;
    }

    public void setHZipCode(String HZipCode) {
        this.HZipCode = HZipCode;
    }

    public String getWZipCode() {
        return WZipCode;
    }

    public void setWZipCode(String WZipCode) {
        this.WZipCode = WZipCode;
    }
    
    
}
