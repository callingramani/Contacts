package com.example.android.contacts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Word> words = new ArrayList<>();


        words.add(new Word("Daughter", "0000000000",R.drawable.family_daughter));
        words.add(new Word("Father", "1111111111",R.drawable.family_father));
        words.add(new Word("Grandfather", "2222222222",R.drawable.family_grandfather));
        words.add(new Word("Grandmother", "3333333333",R.drawable.family_grandmother));
        words.add(new Word("Mother", "4444444444",R.drawable.family_mother));
        words.add(new Word("Older bother", "5555555555",R.drawable.family_older_brother));
        words.add(new Word("Older Sister", "6666666666",R.drawable.family_older_sister));
        words.add(new Word("Son", "7777777777",R.drawable.family_son));
        words.add(new Word("Younger bother", "8888888888",R.drawable.family_younger_brother));
        words.add(new Word("Younger sister", "9999999999",R.drawable.family_younger_sister));

        ListView listView = (ListView) findViewById(R.id.list);
        if(listView!=null)
        {
            listView.setAdapter(new WordAdapter(this,words));

        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if(position ==0) {

                    Intent intent = new Intent(MainActivity.this, Daughter.class);
                    startActivity(intent);
                }
                if(position ==1) {

                    Intent intent = new Intent(MainActivity.this, Father.class);
                    startActivity(intent);
                }
                if(position ==2) {

                    Intent intent = new Intent(MainActivity.this, Grandfather.class);
                    startActivity(intent);
                }
                if(position ==3) {

                    Intent intent = new Intent(MainActivity.this, Grandmother.class);
                    startActivity(intent);
                }
                if(position ==4) {

                    Intent intent = new Intent(MainActivity.this, Mother.class);
                    startActivity(intent);
                }
                if(position ==5) {

                    Intent intent = new Intent(MainActivity.this, Olderbother.class);
                    startActivity(intent);
                }
                if(position ==6) {

                    Intent intent = new Intent(MainActivity.this, Oldersister.class);
                    startActivity(intent);
                }
                if(position ==7) {

                    Intent intent = new Intent(MainActivity.this, Son.class);
                    startActivity(intent);
                }

                if(position ==8) {

                    Intent intent = new Intent(MainActivity.this, Youngerbother.class);
                    startActivity(intent);
                }
                if(position ==9) {

                    Intent intent = new Intent(MainActivity.this, Youngersister.class);
                    startActivity(intent);
                }












            }



        });






    }

}


