package com.example.user.jenga;

import static com.example.user.jenga.R.id.image;

/**
 * Created by user on 15/08/2018.
 */

public class Designers {
    int imagedesign;
    String nameDesign,descriptionDesign,phoneNumberDesign;

    public Designers(int imagedesign, String nameDesign, String descriptionDesign, String phoneNumberDesign) {
        this.imagedesign = imagedesign;
        this.nameDesign = nameDesign;
        this.descriptionDesign = descriptionDesign;
        this.phoneNumberDesign = phoneNumberDesign;
    }

    public int getImagedesign() {
        return imagedesign;
    }

    public void setImagedesign(int imagedesign) {
        this.imagedesign = imagedesign;
    }

    public String getNameDesign() {
        return nameDesign;
    }

    public void setNameDesign(String nameDesign) {
        this.nameDesign = nameDesign;
    }

    public String getDescriptionDesign() {
        return descriptionDesign;
    }

    public void setDescriptionDesign(String descriptionDesign) {
        this.descriptionDesign = descriptionDesign;
    }

    public String getPhoneNumberDesign() {
        return phoneNumberDesign;
    }

    public void setPhoneNumberDesign(String phoneNumberDesign) {
        this.phoneNumberDesign = phoneNumberDesign;
    }
}
