package com.dd.athreya.dev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread splash=new Thread(){
            public void run() {
                try {
                    sleep(3 * 1000);
                    Intent i = new Intent(getBaseContext(), HomePage.class);
                    startActivity(i);
                    finish();
                } catch (Exception e) {
                }
            }
        };
            splash.start();
    }
}
