package com.lyma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.actionbarsherlock.app.SherlockActivity;

public class Lyma extends SherlockActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_layout);
        getSupportActionBar().setTitle(" Home");
        Button banana = (Button)findViewById(R.id.bananas);
        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(getApplicationContext(),Bananas.class);
                startActivity(d);
            }
        });
        Button bean = (Button)findViewById(R.id.beans);
        bean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(getApplicationContext(),Beans.class);
                startActivity(e);
            }
        });
        Button gnut = (Button)findViewById(R.id.gnuts);
        gnut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g = new Intent(getApplicationContext(),Groundnuts.class);
                startActivity(g);
            }
        });
        Button maize = (Button)findViewById(R.id.maize);
        maize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(),Maize.class);
                startActivity(m);
            }
        });

    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }*/

    
}
