package com.letechteam.recyclerviewsample.view_holder;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.letechteam.recyclerviewsample.R;

/**
 * Created by IK SOM OUN on 11/12/2016.
 */

public class PopupImageHolder {
    private View view;
    private PopupWindow popupWindow;
    private SubsamplingScaleImageView imageView;
    private int height;
    private int width;
    private boolean focus;

/*    public PopupImageHolder(PopupWindow popupWindow, View view, int height, int width, boolean focus) {
        this.popupWindow = popupWindow;
        this.view = view;
        this.height = height;
        this.width = width;
        this.focus = focus;
    }*/

    public PopupImageHolder(View view, int height, int width, boolean focus) {
        this.view = view;
        this.height = height;
        this.width = width;
        this.focus = focus;
        imageView = (SubsamplingScaleImageView ) view.findViewById(R.id.popup_image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageClicked();
            }
        });
        this.popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT,true);
        this.popupWindow.setOutsideTouchable(true);
        this.popupWindow.setFocusable(true);
        this.popupWindow.setBackgroundDrawable(new BitmapDrawable());
        //this.popupWindow.setTouchInterceptor(new O);

    }

    private void imageClicked() {
        this.popupWindow.dismiss();
    }

    public void showPopupWindow(int drawable){
        popupWindow.setAnimationStyle(R.anim.popup_window_image_view_animation);
        imageView.setImage(ImageSource.resource(drawable));
        //imageView.setImageResource(drawable);
        popupWindow.showAtLocation(view, Gravity.CENTER, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    }


}
