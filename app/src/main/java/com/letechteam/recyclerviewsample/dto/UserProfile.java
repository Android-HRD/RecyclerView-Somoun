package com.letechteam.recyclerviewsample.dto;

/**
 * Created by IK SOM OUN on 11/12/2016.
 */

public class UserProfile {
    private int pro_img;
    private String pro_name;
    private String pro_time;
    private String con_status;
    private int con_img;
    private int con_like;
    private String con_user_liked;
    private String con_comment_share;

    public UserProfile() {
    }

    public UserProfile(int pro_img, String pro_name, String pro_time, String con_status, int con_img, int con_like, String con_user_liked, String con_comment_share) {
        this.pro_img = pro_img;
        this.pro_name = pro_name;
        this.pro_time = pro_time;
        this.con_status = con_status;
        this.con_img = con_img;
        this.con_like = con_like;
        this.con_user_liked = con_user_liked;
        this.con_comment_share = con_comment_share;
    }

    public int getPro_img() {
        return pro_img;
    }

    public void setPro_img(int pro_img) {
        this.pro_img = pro_img;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_time() {
        return pro_time;
    }

    public void setPro_time(String pro_time) {
        this.pro_time = pro_time;
    }

    public String getCon_status() {
        return con_status;
    }

    public void setCon_status(String con_status) {
        this.con_status = con_status;
    }

    public int getCon_img() {
        return con_img;
    }

    public void setCon_img(int con_img) {
        this.con_img = con_img;
    }

    public int getCon_like() {
        return con_like;
    }

    public void setCon_like(int con_like) {
        this.con_like = con_like;
    }

    public String getCon_user_liked() {
        return con_user_liked;
    }

    public void setCon_user_liked(String con_user_liked) {
        this.con_user_liked = con_user_liked;
    }

    public String getCon_comment_share() {
        return con_comment_share;
    }

    public void setCon_comment_share(String con_comment_share) {
        this.con_comment_share = con_comment_share;
    }
}
