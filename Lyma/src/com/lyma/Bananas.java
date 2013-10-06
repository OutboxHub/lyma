package com.lyma;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockActivity;

/**
 * Created by ssemps on 10/6/13.
 */
public class Bananas extends SherlockActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banana);
        getSupportActionBar().setTitle(" Bananas");
        TextView texture = (TextView)findViewById(R.id.textView4);
        texture.setVisibility(View.GONE);
    }
}
