package com.letechteam.recyclerviewsample.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.letechteam.recyclerviewsample.R;

/**
 * Created by IK SOM OUN on 11/14/2016.
 */

public class CustomArrayListAdapter extends ArrayAdapter {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;

    public CustomArrayListAdapter(Context context, int resource, String[] itemname, Integer[] imgid) {
        super(context, resource);
        this.context = (Activity) context;
        this.itemname = itemname;
        this.imgid = imgid;
    }


    @NonNull
    @Override
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_item, parent,false);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        //TextView extratxt = (TextView) rowView.findViewById(R.id.picture);
        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        //extratxt.setText("Description "+itemname[position]);
        return rowView;

    };
}
