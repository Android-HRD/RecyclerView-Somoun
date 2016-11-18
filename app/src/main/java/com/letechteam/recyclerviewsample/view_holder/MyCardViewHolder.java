package com.letechteam.recyclerviewsample.view_holder;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.letechteam.recyclerviewsample.R;

/**
 * Created by IK SOM OUN on 11/12/2016.
 */

public class MyCardViewHolder {

    private ImageView pro_img;
    private TextView pro_name;
    private TextView pro_time_ago;
    private TextView con_status;
    private ImageView con_img;
    private ImageView con_like;
    private TextView con_user_liked;
    private TextView con_user_comment_share;
    private Button act_btn_like;
    private Button act_btn_comment;
    private Button act_btn_share;
    private ImageButton pro_btn_overflow;
    private CardViewHolderInterface cardViewHolderInterface;

    public MyCardViewHolder(){

    }

    public MyCardViewHolder(CardViewHolderInterface cardViewHolderInterface, ImageButton pro_btn_overflow, ImageView pro_img, TextView pro_name, TextView pro_time_ago, TextView con_status, ImageView con_img, ImageView con_like, TextView con_user_liked, TextView con_user_comment_share, Button act_btn_like, Button act_btn_comment, Button act_btn_share) {
        this.cardViewHolderInterface = cardViewHolderInterface;
        this.pro_btn_overflow = pro_btn_overflow;
        this.pro_img = pro_img;
        this.pro_name = pro_name;
        this.pro_time_ago = pro_time_ago;
        this.con_status = con_status;
        this.con_img = con_img;
        this.con_like = con_like;
        this.con_user_liked = con_user_liked;
        this.con_user_comment_share = con_user_comment_share;
        this.act_btn_like = act_btn_like;
        this.act_btn_comment = act_btn_comment;
        this.act_btn_share = act_btn_share;

        this.pro_btn_overflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pro_btn_overflowActionPerform(view);
            }
        });
    }

    private void pro_btn_overflowActionPerform(View view) {
        cardViewHolderInterface.showPopupMenuProfile(view);
    }

    public ImageView getPro_img() {
        return pro_img;
    }

    public void setPro_img(ImageView pro_img) {
        this.pro_img = pro_img;
        //this.pro_img.setImageResource(R.drawable.comment24);
        //this.pro_img.setImageIcon(activity.getResources().getDrawable(R.drawable.ic_account_circle_red_300_24dp));
    }

    public TextView getPro_name() {
        return pro_name;
    }

    public void setPro_name(TextView pro_name) {
        this.pro_name = pro_name;
    }

    public TextView getPro_time_ago() {
        return pro_time_ago;
    }

    public void setPro_time_ago(TextView pro_time_ago) {
        this.pro_time_ago = pro_time_ago;
    }

    public TextView getCon_status() {
        return con_status;
    }

    public void setCon_status(TextView con_status) {
        this.con_status = con_status;
    }

    public ImageView getCon_img() {
        return con_img;
    }

    public void setCon_img(ImageView con_img) {
        this.con_img = con_img;
    }

    public ImageView getCon_like() {
        return con_like;
    }

    public void setCon_like(ImageView con_like) {
        this.con_like = con_like;
    }

    public TextView getCon_user_liked() {
        return con_user_liked;
    }

    public void setCon_user_liked(TextView con_user_liked) {
        this.con_user_liked = con_user_liked;
    }

    public TextView getCon_user_comment_share() {
        return con_user_comment_share;
    }

    public void setCon_user_comment_share(TextView con_user_comment_share) {
        this.con_user_comment_share = con_user_comment_share;
    }

    public Button getAct_btn_like() {
        return act_btn_like;
    }

    public void setAct_btn_like(Button act_btn_like) {
        this.act_btn_like = act_btn_like;
    }

    public Button getAct_btn_comment() {
        return act_btn_comment;
    }

    public void setAct_btn_comment(Button act_btn_comment) {
        this.act_btn_comment = act_btn_comment;
    }

    public Button getAct_btn_share() {
        return act_btn_share;
    }

    public void setAct_btn_share(Button act_btn_share) {
        this.act_btn_share = act_btn_share;
    }
}
