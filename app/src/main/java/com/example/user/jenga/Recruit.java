package com.example.user.jenga;

/**
 * Created by user on 16/08/2018.
 */

public class Recruit {
    int imageRecruit;
    String nameRecruit,locationRecruit,phoneNumberRecruit;

    public Recruit(int imageRecruit, String nameRecruit, String locationRecruit, String phoneNumberRecruit) {
        this.imageRecruit = imageRecruit;
        this.nameRecruit = nameRecruit;
        this.locationRecruit = locationRecruit;
        this.phoneNumberRecruit = phoneNumberRecruit;
    }

    public int getImageRecruit() {
        return imageRecruit;
    }

    public void setImageRecruit(int imageRecruit) {
        this.imageRecruit = imageRecruit;
    }

    public String getNameRecruit() {
        return nameRecruit;
    }

    public void setNameRecruit(String nameRecruit) {
        this.nameRecruit = nameRecruit;
    }

    public String getLocationRecruit() {
        return locationRecruit;
    }

    public void setLocationRecruit(String locationRecruit) {
        this.locationRecruit = locationRecruit;
    }

    public String getPhoneNumberRecruit() {
        return phoneNumberRecruit;
    }

    public void setPhoneNumberRecruit(String phoneNumberRecruit) {
        this.phoneNumberRecruit = phoneNumberRecruit;
    }
}
