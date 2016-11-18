package com.letechteam.recyclerviewsample.model;

import java.util.ArrayList;

/**
 * Created by Pen Lymeng on 11/6/2016.
 */

public class Item {
    private static String[] title =
            {"You can do anything, but not everything.",
             "Perfection is achieved, not when there is nothing more to add, but when there is nothing left to take away.",
                    "The richest man is not he who has the most, but he who needs the least.",
                    "You miss 100 percent of the shots you never take.",
                    "Courage is not the absence of fear, but rather the judgement that something else is more important than fear.",
                    "You must be the change you wish to see in the world.","When hungry, eat your rice; when tired, close your eyes. Fools may laugh at me, but wise men will know what I mean.",
                    "The third-rate mind is only happy when it is thinking with the majority. The second-rate mind is only happy when it is thinking with the minority. The first-rate mind is only happy when it is thinking.",
                    "To the man who only has a hammer, everything he encounters begins to look like a nail.","Now she get a boyfriend :(","My name is Pen Lymeng.","We are what we repeatedly do; excellence, then, is not an act but a habit.",
                    "She is so cute.","Now she get a boyfriend :("};

    private static int[] picture = {android.R.drawable.ic_menu_edit,android.R.drawable.ic_menu_call,android.R.drawable.ic_menu_camera,android.R.drawable.ic_menu_day,android.R.drawable.ic_menu_add,android.R.drawable.ic_menu_edit,android.R.drawable.ic_menu_call,android.R.drawable.ic_menu_camera,android.R.drawable.ic_menu_day,android.R.drawable.ic_menu_add,android.R.drawable.ic_menu_edit,android.R.drawable.ic_menu_call,android.R.drawable.ic_menu_camera,android.R.drawable.ic_menu_day,android.R.drawable.ic_menu_add};

    public static ArrayList<ListItem> getList(){
        ArrayList<ListItem> listItems = new ArrayList<>();
        for(int i=0;i<title.length;i++){
            listItems.add(new ListItem(title[i],picture[i]));
        }
        return listItems;
    }

}
