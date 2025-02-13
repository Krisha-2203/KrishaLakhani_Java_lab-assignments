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
public class ProfileDirectory {
  private ArrayList<ProfileSummary> PersonList;

public ProfileDirectory() {
    this.PersonList = new ArrayList<>();
}

public ArrayList<ProfileSummary> getPersonList() {
    return PersonList;
}

public void setPersonList(ArrayList<ProfileSummary> PersonList) {
    this.PersonList = PersonList;
}

public ProfileSummary addProfile(String FirstName, String LastName, Work work, Home home, int Age) {
    ProfileSummary profile = new ProfileSummary(FirstName, LastName, Age, home, work);
    PersonList.add(profile);
    return profile;
}

public void deleteProfileSummary(ProfileSummary profileSummary) {
    PersonList.remove(profileSummary);
}

public ProfileSummary searchProfileSummary(String FirstName, String LastName, String WorkStreetAddress, String HomeStreetAddress) {
    for (ProfileSummary profileSummary : PersonList) {
        if (profileSummary.getFirstName().toLowerCase().contains(FirstName.toLowerCase()) ||
            profileSummary.getLastName().toLowerCase().contains(LastName.toLowerCase()) ||
            profileSummary.getWork().getWorkStreetAddress().toLowerCase().contains(WorkStreetAddress.toLowerCase()) ||
            profileSummary.getHome().getHomeStreetAddress().toLowerCase().contains(HomeStreetAddress.toLowerCase())) {
            return profileSummary;
        }
    }
    // If no match is found, return null
    return null;
}
}
