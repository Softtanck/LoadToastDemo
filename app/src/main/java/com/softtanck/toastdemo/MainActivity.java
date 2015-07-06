package com.softtanck.toastdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import net.steamcrafted.loadtoast.LoadToast;


public class MainActivity extends AppCompatActivity {

    private LoadToast loadToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadToast = new LoadToast(MainActivity.this);
        loadToast.setText("Loading.....");
        loadToast.setTranslationY(200);
    }

    public void show(View view) {
        loadToast.show();
    }


    public void success(View view) {
        loadToast.success();
    }


    public void error(View view) {
        loadToast.error();
    }
}
