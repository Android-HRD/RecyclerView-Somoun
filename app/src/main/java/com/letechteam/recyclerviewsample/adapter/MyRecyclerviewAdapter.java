package com.letechteam.recyclerviewsample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.letechteam.recyclerviewsample.R;
import com.letechteam.recyclerviewsample.model.Item;
import com.letechteam.recyclerviewsample.model.ListItem;

import java.util.List;

/**
 * Created by Pen Lymeng on 11/6/2016.
 */

public class MyRecyclerviewAdapter extends RecyclerView.Adapter<MyRecyclerviewAdapter.ItemHolder> {


    LayoutInflater inflater;
    List<ListItem> listItems;


    public MyRecyclerviewAdapter(Context context, List<ListItem> listItems) {
        inflater = LayoutInflater.from(context);
        this.listItems = listItems;
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,null);


        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        ListItem item = listItems.get(position);
        holder.title.setText(item.getTitle());
        holder.picture.setImageResource(item.getPicture());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }


    class ItemHolder extends RecyclerView.ViewHolder {

        private ImageView picture;
        private TextView title;
        private View container;

        public ItemHolder(View itemView) {
            super(itemView);

            picture = (ImageView) itemView.findViewById(R.id.picture);
            title = (TextView) itemView.findViewById(R.id.title);
            container = itemView.findViewById(R.id.cont_item_root);

        }
    }

}
