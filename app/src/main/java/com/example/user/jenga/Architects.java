package com.example.user.jenga;

/**
 * Created by user on 15/08/2018.
 */

class Architects {
    int imageArchitect;
    String nameArchitect,locationArchitect,phoneNumberArchitect;

    public Architects(int imageArchitect, String nameArchitect, String locationArchitect, String phoneNumberArchitect) {
        this.imageArchitect = imageArchitect;
        this.nameArchitect = nameArchitect;
        this.locationArchitect = locationArchitect;
        this.phoneNumberArchitect = phoneNumberArchitect;
    }

    public int getImageArchitect() {
        return imageArchitect;
    }

    public void setImageArchitect(int imageArchitect) {
        this.imageArchitect = imageArchitect;
    }

    public String getNameArchitect() {
        return nameArchitect;
    }

    public void setNameArchitect(String nameArchitect) {
        this.nameArchitect = nameArchitect;
    }

    public String getLocationArchitect() {
        return locationArchitect;
    }

    public void setLocationArchitect(String locationArchitect) {
        this.locationArchitect = locationArchitect;
    }

    public String getPhoneNumberArchitect() {
        return phoneNumberArchitect;
    }

    public void setPhoneNumberArchitect(String phoneNumberArchitect) {
        this.phoneNumberArchitect = phoneNumberArchitect;
    }
}
