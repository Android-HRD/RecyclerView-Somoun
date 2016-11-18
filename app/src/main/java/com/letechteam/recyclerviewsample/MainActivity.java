package com.letechteam.recyclerviewsample;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupWindow;

import com.letechteam.recyclerviewsample.adapter.CustomArrayListAdapter;
import com.letechteam.recyclerviewsample.adapter.CustomeRecyclerAdapter;
import com.letechteam.recyclerviewsample.adapter.MyRecyclerviewAdapter;
import com.letechteam.recyclerviewsample.dto.UserProfile;
import com.letechteam.recyclerviewsample.model.Item;
import com.letechteam.recyclerviewsample.view_holder.CardViewHolderInterface;
import com.letechteam.recyclerviewsample.view_holder.PopupImageHolder;
import com.paginate.Paginate;

import java.util.ArrayList;

import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter;
import jp.wasabeef.recyclerview.animators.SlideInLeftAnimator;

public class MainActivity extends AppCompatActivity implements CardViewHolderInterface{

    private ListView listView;
    private RecyclerView mRecyclerView;
    private PopupImageHolder popupImageHolder;
    private ArrayList<UserProfile> userDatasource;
    private PopupMenu popupMenuPro;

    //private ArrayList<Contact> contactList;
    private int i;
    private int page = 1;
    private int num = 20;
    private int itemPerPage = 20;
    private boolean loading;
    //private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

/*        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(contactList, this);*/

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*        listView = (ListView) findViewById(R.id.testListView);
        String itemName[] = {"Remove", "Update", "Delete"};
        Integer icons[] = {R.drawable.comment24, android.support.v7.appcompat.R.drawable.abc_ic_star_black_36dp, R.drawable.like24};
        listView.setAdapter(new CustomArrayListAdapter(this, R.layout.list_item, itemName, icons));*/
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_list);
        final CustomeRecyclerAdapter adapter = new CustomeRecyclerAdapter();
        adapter.setMainActivity(this);
        userDatasource = generateUserItem();
        adapter.setUserPro(userDatasource);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        View popupLayout = getLayoutInflater().inflate(R.layout.popup_image,null,false);
        popupImageHolder = new PopupImageHolder(popupLayout, ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT,true);
        //mRecyclerView.setItemAnimator(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
        ScaleInAnimationAdapter animateAdapter = new ScaleInAnimationAdapter(adapter);
        mRecyclerView.setItemAnimator(new SlideInLeftAnimator());
        mRecyclerView.setAdapter(animateAdapter);

        Paginate.Callbacks callbacks = new Paginate.Callbacks() {
            @Override
            public void onLoadMore() {
                loading = true;

                page++;
                num += itemPerPage;

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        while (i <= num){
                            userDatasource.add(new UserProfile(R.drawable.usericon,"Som Oun" + i, "time : " + i, "today i'm stopid very stoped : " + i, R.drawable.img3, R.drawable.ic_thumb_up_black_18dp, "You and " + i + " friends liked", "1 commented and 2 shared"));
                            adapter.notifyItemInserted(userDatasource.size() - 1);
                            i++;
                        }
                        loading = false;
                    }
                }, 2000);

            }

            @Override
            public boolean isLoading() {
                return loading;
            }

            @Override
            public boolean hasLoadedAllItems() {
                return page == 5;
            }
        };

        Paginate.with(mRecyclerView, callbacks)
                .setLoadingTriggerThreshold(5)
                .addLoadingListItem(true)
                .build();
     //   mRecyclerView.setAdapter(adapter);
    }

    private ArrayList<UserProfile> generateUserItem(){
        ArrayList<UserProfile> user = new ArrayList<>();
        int pic;
        for (int i = 0; i < 50; i++){
            if((i % 2) == 0){
               pic = R.drawable.picture1;
            }else {
                pic = R.drawable.picture6;
            }
            user.add(new UserProfile(R.drawable.usericon,"Som Oun" + i, "time : " + i, "today i'm stopid very stoped : " + i, pic, R.drawable.ic_thumb_up_black_18dp, "You and " + i + " friends liked", "1 commented and 2 shared"));
        }
        return user;
    }

    public void showImageView(int position){
        //getActionBar().setBackgroundDrawable(getResources().getDrawable(android.support.v7.appcompa));
        UserProfile user = userDatasource.get(position);
        popupImageHolder.showPopupWindow(user.getCon_img());
    }

    @Override
    public void onBackPressed() {

    }

    private void addActionOnViews(){
        Button btnLike = (Button) findViewById(R.id.act_btn_like);
        Button btnComment = (Button) findViewById(R.id.act_btn_comment);
        Button btnShare = (Button) findViewById(R.id.act_con_share);

    }

    @Override
    public void showPopupMenuProfile(View view) {

        String itemName[] = {"Remove", "Update", "Delete"};
        Integer icons[] = {R.drawable.comment24, android.support.v7.appcompat.R.drawable.abc_ic_star_black_36dp, R.drawable.like24};
        ListView listView = new ListView(getApplicationContext());
        listView.setAdapter(new CustomArrayListAdapter(MainActivity.this, R.layout.list_item, itemName, icons));
        PopupWindow pwin = new PopupWindow(listView);
        //pwin.showAtLocation(,Gravity.CENTER,listView.getWidth(), listView.getHeight());
        /*if (popupMenuPro == null){
            popupMenuPro = new PopupMenu(MainActivity.this, view);
            popupMenuPro.getMenuInflater().inflate(R.menu.p_menu_pro,popupMenuPro.getMenu());
        }
        //popupMenuPro.setGravity(Gravity.CENTER);
        popupMenuPro.show();*/
    }
}
