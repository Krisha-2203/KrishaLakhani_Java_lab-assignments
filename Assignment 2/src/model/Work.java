/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author krish
 */
public class Work {
    private String WorkStreetAddress;
    private char WUnitNumber;
    private String WCity;
    private String WState;
    private String WLandmark;
    private String WZipCode;
    private long WTelephone;
    private String WPhNumber;

   

    public Work(String WorkStreetAddress, char WUnitNumber, String WCity, String WState, String WLandmark, String WZipCode, long WTelephone, String WPhNumber) {
        this.WorkStreetAddress = WorkStreetAddress;
        this.WUnitNumber = WUnitNumber;
        this.WCity = WCity;
        this.WState = WState;
        this.WLandmark = WLandmark;
        this.WZipCode = WZipCode;
        this.WTelephone = WTelephone;
        this.WPhNumber = WPhNumber;
    }

    public String getWorkStreetAddress() {
        return WorkStreetAddress;
    }

    public void setWorkStreetAddress(String WorkStreetAddress) {
        this.WorkStreetAddress = WorkStreetAddress;
    }

    public char getWUnitNumber() {
        return WUnitNumber;
    }

    public void setWUnitNumber(char WUnitNumber) {
        this.WUnitNumber = WUnitNumber;
    }

    public String getWCity() {
        return WCity;
    }

    public void setWCity(String WCity) {
        this.WCity = WCity;
    }

    public String getWState() {
        return WState;
    }

    public void setWState(String WState) {
        this.WState = WState;
    }

    public String getWLandmark() {
        return WLandmark;
    }

    public void setWLandmark(String WLandmark) {
        this.WLandmark = WLandmark;
    }

    public String getWZipCode() {
        return WZipCode;
    }

    public void setWZipCode(String WZipCode) {
        this.WZipCode = WZipCode;
    }

    public long getWTelephone() {
        return WTelephone;
    }

    public void setWTelephone(long WTelephone) {
        this.WTelephone = WTelephone;
    }

    public String getWPhNumber() {
        return WPhNumber;
    }

    public void setWPhNumber(String WPhNumber) {
        this.WPhNumber = WPhNumber;
    }
}
