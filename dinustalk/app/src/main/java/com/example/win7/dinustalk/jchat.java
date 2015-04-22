package com.example.win7.dinustalk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by win7 on 4/21/2015.
 */
public class jchat extends Activity {
    String[] chatArray = {"Chat 1", "Chat 2", "Chat 3", "Chat 4","Chat 5","Chat 6","Chat 7","Chat 8","Chat 9","Chat 10","Chat 11", "Chat 12", "Chat 13", "Chat 14","Chat 15","Chat 16","Chat 17","Chat 18","Chat 19","Chat 20"};

    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.chatlistview, chatArray);

        ListView listView = (ListView) findViewById(R.id.chatlist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String ambil=((TextView) view).getText().toString();

                Intent intent = new Intent(getApplicationContext(), jchatting.class);
                intent.putExtra("ambil",ambil);
                startActivity(intent);

            }
        });

    }
}
