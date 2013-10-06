package com.lyma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splashscreen);
		 Thread timer = new Thread(){
	          public void run(){
	              try { 
	                  sleep(2000);

	              }catch (InterruptedException e){
	                  e.printStackTrace();
	              }finally {
	                  Intent shift = new Intent(SplashScreen.this,Lyma.class);
	                  startActivity(shift);

	              }
	          }
	        };
	        timer.start();
	    }

	    @Override
	    protected void onPause() {
	        super.onPause();
	        finish();
	        //song.release();
	}
	    
/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
*/
}
