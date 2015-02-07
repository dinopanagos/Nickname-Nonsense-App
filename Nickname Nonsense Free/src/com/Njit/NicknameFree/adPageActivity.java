package com.Njit.NicknameFree;
import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import com.google.ads.*;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;

public class adPageActivity extends Activity 
{
	private AdView adView;
	CountDownTimer timer;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.adspace);
       //---------------------------------------ADMOB ADS----------------------------------------------------------------------------- 
        adView = new AdView(this, AdSize.SMART_BANNER, "a14f9877db016b7");
    	LinearLayout  layout = (LinearLayout)findViewById(R.id.linLayout);
    	layout.addView(adView);    	
    	AdRequest adRequest = new AdRequest();    
    	adView.loadAd(adRequest);   	
    	
    	//------------COUNT DOWN TO TRYAGAIN---------------------------------------------------------------------------------------------------
    	final TextView tv = (TextView)findViewById(R.id.num);
    	 
    	
    	new CountDownTimer(11000, 1000) {

    	     public void onTick(long millisUntilFinished) {
    	    	
    	    	  int first = (int) millisUntilFinished / 1000;
    	    	 String last =  String.valueOf(first);
    	    	
    	         tv.setText(" "+last);
    	     }

    	     public void onFinish() {
    	         tv.setText(" NOW ");
    	     }
    	  }.start();
    	
    	
    	//-----------------------------------------------TRYAGAIN BUTTON FADE IN ------------------------------------------------		
    	final ImageButton hit = (ImageButton) findViewById(R.id.tryButton2);
    	 
    	 final Animation animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein);
    	 
    	 //--------------------------LOGO TO WEBSITE (MARKET)--------------------------------------
    	ImageButton cent = (ImageButton)findViewById(R.id.cents);
    	
    	 cent.setOnClickListener(new OnClickListener(){
    		    
    		    public void onClick(View v) {
    		        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=Nickname Nonsense")); //search for Nickname Nonsense
    		        startActivity(i);
    		    }
    		});
    	
    	//---------------------------------------------------------------------------FADE IN BUTTON CLICKABLE?--------------------------------------- 
        
    	 hit.setVisibility(View.GONE); 
    	 animationFadeIn.setStartOffset(1000);
    	 animationFadeIn.setAnimationListener(new AnimationListener() {

    	      
    	      public void onAnimationStart(Animation animation) {
    	    	  hit.setEnabled(false);//unlclickable
    	         hit.setVisibility(View.VISIBLE);
    	      }

    	   
    	      public void onAnimationRepeat(Animation animation) {
    	         // Nothing to do here
    	      }

    	   
    	      public void onAnimationEnd(Animation animation) {
    	    	  hit.setEnabled(true); //set clickable
    	         // Nothing to do here
    	      }
    	   });
    	 hit.startAnimation(animationFadeIn);
    	 
    	 
    	//-----------------------BACK TO FRONT PAGE---------------------------------------------- 
         hit.setOnClickListener(new View.OnClickListener() 
         {
 			
 		public void onClick(View v) {
 				Intent theIntent = new Intent(adPageActivity.this, mainActivity.class);
 				adPageActivity.this.startActivity(theIntent);
 								
 									}
 		}); 
    	
    	//----------------------------------------------------------------
    
   	
    	
    }
   
    @Override
    public void onBackPressed()
    {
    moveTaskToBack(true);
    }
    
     
    @Override
    public void onDestroy() {
      if (adView != null) {
        adView.destroy();
      }
      super.onDestroy();
    }
}
