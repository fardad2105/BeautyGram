package com.example.beautygram.models;

import java.lang.reflect.Array;

public class SearchPage {

    private int id;
    private int pf_image;
    private String name;
    private int slide_theme;
    private int[] sample_hairs;
    private String Advertise;
    private String Address;
    private int comments_count;

    public SearchPage() {
    }

    public SearchPage(int id,int pf_image, String name, int slide_theme, int[] sample_hairs, String advertise, String address, int comments_count) {
        this.id = id;
        this.pf_image = pf_image;
        this.name = name;
        this.slide_theme = slide_theme;
        this.sample_hairs = sample_hairs;
        Advertise = advertise;
        Address = address;
        this.comments_count = comments_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPf_image() {
        return pf_image;
    }

    public void setPf_image(int pf_image) {
        this.pf_image = pf_image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSlide_theme() {
        return slide_theme;
    }

    public void setSlide_theme(int slide_theme) {
        this.slide_theme = slide_theme;
    }

    public int[] getSample_hairs() {
        return sample_hairs;
    }

    public void setSample_hairs(int[] sample_hairs) {
        this.sample_hairs = sample_hairs;
    }

    public String getAdvertise() {
        return Advertise;
    }

    public void setAdvertise(String advertise) {
        Advertise = advertise;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }
}
