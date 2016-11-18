package com.letechteam.recyclerviewsample.model;

/**
 * Created by Pen Lymeng on 11/6/2016.
 */

public class ListItem {
    private String title;
    private int picture;
    private String subTitle;
    private boolean favorite=false;


    ListItem(String title, int picture) {
        this.title = title;
        this.picture = picture;
    }

    public ListItem(String title, int picture, String subTitle, boolean favorite) {
        this.title = title;
        this.picture = picture;
        this.subTitle = subTitle;
        this.favorite = favorite;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
