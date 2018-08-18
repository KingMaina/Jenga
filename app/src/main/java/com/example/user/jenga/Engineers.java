package com.example.user.jenga;

/**
 * Created by user on 15/08/2018.
 */

public class Engineers {
    int imageEngineers;
    String nameEngineer,locationEngineer,phoneNumberEngineer;

    public Engineers(int imageEngineers, String nameEngineer, String locationEngineer, String phoneNumberEngineer) {
        this.imageEngineers = imageEngineers;
        this.nameEngineer = nameEngineer;
        this.locationEngineer = locationEngineer;
        this.phoneNumberEngineer = phoneNumberEngineer;
    }

    public int getImageEngineers() {
        return imageEngineers;
    }

    public void setImageEngineers(int imageEngineers) {
        this.imageEngineers = imageEngineers;
    }

    public String getNameEngineer() {
        return nameEngineer;
    }

    public void setNameEngineer(String nameEngineer) {
        this.nameEngineer = nameEngineer;
    }

    public String getLocationEngineer() {
        return locationEngineer;
    }

    public void setLocationEngineer(String locationEngineer) {
        this.locationEngineer = locationEngineer;
    }

    public String getPhoneNumberEngineer() {
        return phoneNumberEngineer;
    }

    public void setPhoneNumberEngineer(String phoneNumberEngineer) {
        this.phoneNumberEngineer = phoneNumberEngineer;
    }
}
