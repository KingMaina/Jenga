package com.example.user.jenga;

/**
 * Created by user on 10/08/2018.
 */

public class Here {
    //    refer to image based on id
    int image;
    String name,description,phoneNumber;

    public Here(int image, String name, String description, String phoneNumber) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.phoneNumber = phoneNumber;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}