package com.letechteam.recyclerviewsample.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.letechteam.recyclerviewsample.MainActivity;
import com.letechteam.recyclerviewsample.R;
import com.letechteam.recyclerviewsample.dto.UserProfile;
import com.letechteam.recyclerviewsample.view_holder.MyCardViewHolder;

import java.util.ArrayList;

/**
 * Created by IK SOM OUN on 11/12/2016.
 */

public class CustomeRecyclerAdapter extends RecyclerView.Adapter<CustomeRecyclerAdapter.MycustomeViewHolder> {

    private ArrayList<UserProfile> userPro;
    private int lastPosition = -1;
    private MainActivity mainActivity;

    //private View viewLayout;

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public ArrayList<UserProfile> getUserPro() {
        return userPro;
    }

    public void setUserPro(ArrayList<UserProfile> userPro) {
        this.userPro = userPro;
    }

    @Override
    public MycustomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
//        if (viewLayout == null){
//            viewLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_card_view, parent, false);
//        }

        //Toast.makeText(parent.getContext(),"view type : " + viewType, Toast.LENGTH_SHORT);
        Log.d("View type : ", "Value of : " + viewType);
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters...
        //MycustomeViewHolder vh = new MycustomeViewHolder(v);
        return new MycustomeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MycustomeViewHolder holder, int position) {
        UserProfile pro = userPro.get(position);
        holder.myCardViewHolder.getPro_img().setImageResource(pro.getPro_img());
        holder.myCardViewHolder.getPro_name().setText(pro.getPro_name());
        holder.myCardViewHolder.getPro_time_ago().setText(pro.getPro_time());
        holder.myCardViewHolder.getCon_status().setText(pro.getCon_status());
        holder.myCardViewHolder.getCon_img().setImageResource(pro.getCon_img());
        holder.myCardViewHolder.getCon_like().setImageResource(pro.getCon_like());
        holder.myCardViewHolder.getCon_user_liked().setText(pro.getCon_user_liked());
        holder.myCardViewHolder.getCon_user_comment_share().setText(pro.getCon_comment_share());
        //Log.d("address of holder : ", "" + holder.hashCode());
    }

    @Override
    public int getItemCount() {
        return userPro.size();
    }

    public class MycustomeViewHolder extends RecyclerView.ViewHolder{
        private MyCardViewHolder myCardViewHolder;

        public MyCardViewHolder getMyCardViewHolder() {
            return myCardViewHolder;
        }

        public void setMyCardViewHolder(MyCardViewHolder myCardViewHolder) {
            this.myCardViewHolder = myCardViewHolder;
        }

        public MycustomeViewHolder(View itemView) {
            super(itemView);
            myCardViewHolder = new MyCardViewHolder(mainActivity, (ImageButton)itemView.findViewById(R.id.pro_btn_overlow), (ImageView)itemView.findViewById(R.id.pro_img),(TextView)itemView.findViewById(R.id.pro_name), (TextView)itemView.findViewById(R.id.pro_time_ago), (TextView)itemView.findViewById(R.id.con_status), (ImageView) itemView.findViewById(R.id.con_img), (ImageView) itemView.findViewById(R.id.con_like), (TextView)itemView.findViewById(R.id.con_user_liked), (TextView)itemView.findViewById(R.id.con_user_comment_share), (Button) itemView.findViewById(R.id.act_btn_like), (Button) itemView.findViewById(R.id.act_btn_comment), (Button) itemView.findViewById(R.id.act_con_share));
            myCardViewHolder.getCon_img().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mainActivity.showImageView(getAdapterPosition());
                }
            });
        }
    }

    /**
     * Here is the key method to apply the animation
     */
    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated

        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(viewToAnimate.getContext(), android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }
}
