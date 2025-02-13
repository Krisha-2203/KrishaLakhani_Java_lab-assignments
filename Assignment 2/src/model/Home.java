/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author krish
 */
public class Home {
    
    private String HomeStreetAddress;
    private char HUnitNumber;
    private String HCity;
    private String HState;
    private String HLandmark;
    private String HZipCode;
    private long HTelephone;
    private String HPhNumber;


    public Home(String HomeStreetAddress, char HUnitNumber, String HCity, String HState, String HLandmark, String HZipCode, long HTelephone, String HPhNumber){
        this.HomeStreetAddress = HomeStreetAddress;
        this.HUnitNumber = HUnitNumber;
        this.HCity = HCity;
        this.HState = HState;
        this.HLandmark = HLandmark;
        this.HZipCode = HZipCode;
        this.HTelephone = HTelephone;
        this.HPhNumber = HPhNumber;
    }
      public String getHomeStreetAddress() {
        return HomeStreetAddress;
    }

    public void setHomeStreetAddress(String HomeStreetAddress) {
        this.HomeStreetAddress = HomeStreetAddress;
    }

    public char getHUnitNumber() {
        return HUnitNumber;
    }

    public void setHUnitNumber(char HUnitNumber) {
        this.HUnitNumber = HUnitNumber;
    }

    public String getHCity() {
        return HCity;
    }

    public void setHCity(String HCity) {
        this.HCity = HCity;
    }

    public String getHState() {
        return HState;
    }

    public void setHState(String HState) {
        this.HState = HState;
    }

    public String getHLandmark() {
        return HLandmark;
    }

    public void setHLandmark(String HLandmark) {
        this.HLandmark = HLandmark;
    }

    public String getHZipCode() {
        return HZipCode;
    }

    public void setHZipCode(String HZipCode) {
        this.HZipCode = HZipCode;
    }

    public long getHTelephone() {
        return HTelephone;
    }

    public void setHTelephone(long HTelephone) {
        this.HTelephone = HTelephone;
    }

    public String getHPhNumber() {
        return HPhNumber;
    }

    public void setHPhNumber(String HPhNumber) {
        this.HPhNumber = HPhNumber;
    }

    
}
