package com.Njit.NicknameFree;

import com.google.ads.*;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Typeface;
import android.widget.ImageButton;

public class nicknameActivity extends Activity
{
	private AdView adView;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.nickname);
    //---------------------------------------ADMOB BANNER-----------------------------------------------------------------------------
        adView = new AdView(this, AdSize.BANNER, "a14f9877db016b7");
    	LinearLayout  layout = (LinearLayout)findViewById(R.id.nameLayout);
    	layout.addView(adView);   	
    	AdRequest adRequest = new AdRequest();   
    	adView.loadAd(adRequest);
    	//------------------------------------SIZE SET ANIMATION--------------------------------------------------------------    	
    	Animation a = AnimationUtils.loadAnimation(this, R.anim.translate);     
        String it = getIntent().getStringExtra("name");
        TextView txt = (TextView) findViewById(R.id.theNickname);
     	Typeface type = Typeface.createFromAsset(getAssets(),"namefont.ttf"); // put font(.ttf) in the assets 
     	
 	    txt.setTypeface(type); // set textView font
 	    
 	    if(it.length()>=14)//if text is 14 or greater
 	    {
 	    	txt.setTextSize(20);
 	    }
 	    
        txt.setText(it); //set the seen textview to the new name	 
        txt.startAnimation(a);
       //--------------------------------------NEXT BUTTON----------------------------------------------------------------------
        ImageButton next1 = (ImageButton)findViewById(R.id.next);
        
        next1.setOnClickListener(new View.OnClickListener() 
        {
			
		public void onClick(View v) {
				Intent theIntent3 = new Intent(nicknameActivity.this, adPageActivity.class);
				nicknameActivity.this.startActivity(theIntent3);
								
									}
		}); 
        
    }
    //---------------------------------IF BACK BUTTON PRESSED END APP------------------------------
   @Override
    public void onBackPressed()
    {
    moveTaskToBack(true);
    }
} 