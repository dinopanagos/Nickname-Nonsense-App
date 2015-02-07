package com.Njit.NicknameFree;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler; 
import android.view.Window;


public class titleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash);
        //---------------------------------------------------------DELAY--------------------------------------
        new Handler().postDelayed(new Runnable() 
        {
          //  @Override
        	//overriding run method to start a new intent 
            public void run() 
            {
                final Intent mainIntent = new Intent(titleActivity.this, mainActivity.class);
               
                titleActivity.this.startActivity(mainIntent);
                titleActivity.this.finish();
            }
            //seconds = number/1000
        }, 4000); 
        
               
        
    }
        
    }
