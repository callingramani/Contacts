package com.example.android.contacts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by ankit on 31-05-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Context context, ArrayList<Word> objects) {
        super(context, 0,objects);


    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }

        Word currentWord = getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.text_view1);

        textView.setText(currentWord.getmContactName());

        TextView textView1 = (TextView) listItemView.findViewById(R.id.text_view2);

        textView1.setText(currentWord.getmPhoneNumber());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(currentWord.getmresorceId());





        /*View linearLayout = listItemView.findViewById(R.id.text_container);

        int color= ContextCompat.getColor(getContext(),);

        linearLayout.setBackgroundColor(color);*/

        return listItemView;

    }
}