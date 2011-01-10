package com.cookbook.activity_lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

public class ActivityLifeCycle extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        
        //setup button
        Button startButton = (Button) findViewById(R.id.Button01);
        startButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				showMessage("Clicked button");
				
			}
		});
        
    }
    
    private void showMessage(String msg){
    	Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
    
    
    @Override
    protected void onStart(){
    	super.onStart();
    	Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
    	super.onResume();
    	Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    	
    }
    @Override
    protected void onRestart(){
    	super.onResume();
    	Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    	
    }
    @Override
    protected void onPause(){
    	super.onPause();
    	Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
  
    }
    @Override
    protected void onStop(){
    	super.onStop();
    	Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy(){
    	super.onDestroy();
    	Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
    
}