package com.example.win7.dinustalk;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

/**
 * Created by win7 on 4/21/2015.
 */
public class jhome extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, jprofil.class);
        spec = tabHost.newTabSpec("Profil").setIndicator("Profil")
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, jchat.class);
        spec = tabHost.newTabSpec("Chat").setIndicator("Chat")
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, jcontact.class);
        spec = tabHost.newTabSpec("Contact").setIndicator("Contact")
                .setContent(intent);
        tabHost.addTab(spec);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
