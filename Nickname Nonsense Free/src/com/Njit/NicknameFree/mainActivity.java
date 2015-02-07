package com.Njit.NicknameFree;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.regex.Pattern;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;

import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;



public class mainActivity extends Activity 
{
	
	//-------------------------TOAST MSG SAYINGS---------------------------------------------------------
	EditText username ;
	public String str1;
	CharSequence text = "Name must be longer than 2 letters!";
	CharSequence text2 = "What are you a robot?";
	CharSequence text3 = "Serious Dude, you dont have a name?";
	CharSequence text4 = "Bra, your name can't be that long";
	CharSequence text5 = "No spaces or symbols  ";
	 
	    int duration = Toast.LENGTH_SHORT; //length of message
    private AdView adView;
  
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.main);      
              
      //---------------------------------------------ADMOB BANNERS------------------------------------------  
        adView = new AdView(this, AdSize.SMART_BANNER, "a14f9877db016b7");
    	LinearLayout  mlayout = (LinearLayout)findViewById(R.id.mLayout);
    	mlayout.addView(adView);    	
    	AdRequest adRequest = new AdRequest();    
    	adView.loadAd(adRequest); 
        
        
     //-------------------------------------------TOASTS IF BUTTON CLICKED NAME WRONG & RIGHT------------------------------------   
        // BUTTON CLICK TO Loading SCREEN 
    ImageButton Click = (ImageButton) findViewById(R.id.imageButton1);
      
      // what ever the user types in as a name
       username = (EditText)findViewById(R.id.FirstName);
        
        // on button click
        Click.setOnClickListener(new View.OnClickListener() 
        {
			
		public void onClick(View v) {
				
		
				//change users name to a String
				 str1 = username.getText().toString();
				 //Both error messages
				 Toast ShortToast = Toast.makeText(mainActivity.this, text, duration);
				 Toast NumToast = Toast.makeText(mainActivity.this, text2, duration);
				 Toast NoToast = Toast.makeText(mainActivity.this, text3, duration);
				 Toast LengthToast = Toast.makeText(mainActivity.this, text4, duration);
				 Toast SymbolToast = Toast.makeText(mainActivity.this, text5, duration);
						
				 //if name is less then three letters and doesn't contain a # wont go to next screen and pop up will come 
				 if(str1.length()== 0)//no letters
				{
					NoToast.show();
				}
				else if(str1.length()>=12)//name longer then 11
				{
					LengthToast.show();
				}
				 else  if(str1.length()>=3 &&containsNum(str1)==1)//3letters and no numbers
				{
					 if(Pattern.matches("[a-zA-Z]+", str1)) //if not perfect must contain a symbol
					 { 
						
				// start with this activity going to loading screen 
				Intent myIntent = new Intent(mainActivity.this, loadActivity.class);
				
				// str1 will be called user name in the loading activity
				myIntent.putExtra("username", str1);
				//start loading screen from this screen
				mainActivity.this.startActivity(myIntent);
					 }
					 else 
					 { 
					 SymbolToast.show();//symbol message
					 }
				}
				else if(containsNum(str1)==0)//has a number
				{
					NumToast.show(); //show number toast
				}
				else
				{
					ShortToast.show();// show short name notice
				}
				
									}
		});
                
    }
    
    
    //----------------------------------------------------NAME METHODS-------------------------------------------
    //for loop checking if the string entered contains a number
     public int containsNum(String s)
     {    
	    for (char c: s.toCharArray())
	    {
	        if(Character.isDigit(c))
	        {
	            return 0;//true
	        }
	    }

	    return 1; // false
     }
    //-----------------------------------------------------------------------------------------------------------
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
