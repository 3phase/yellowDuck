package com.yellow_patka.thepatka;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SelectActivity extends Activity implements OnClickListener{

	Button lv_1, lv_2, lv_3, lv_4, lv_5, lv_42, back;
	public void in(){
		startActivity(new Intent(this, MainActivity.class));
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level_select);
		back = (Button) findViewById(R.id.backBtn);
		lv_1 = (Button) findViewById(R.id.lvl1_btn);
		lv_2 = (Button) findViewById(R.id.lvl2_btn);
		lv_3 = (Button) findViewById(R.id.lvl3_btn);
		lv_4 = (Button) findViewById(R.id.lvl4_btn);
		
		lv_1.setOnClickListener(this);
		lv_2.setOnClickListener(this);
		lv_3.setOnClickListener(this);
		lv_4.setOnClickListener(this);
		back.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		if(v.getId()== lv_1.getId()){
			startActivity(new Intent(this, PlayActivity.class));
		}else if(v.getId()== lv_2.getId()){
			startActivity(new Intent(this, Level2Activity.class));
		}else if(v.getId() == lv_3.getId()) {
			startActivity(new Intent(this, Level3Activity.class));
		}else if (v.getId() == lv_4.getId()) {
			startActivity(new Intent(this, Level4Activity.class));
			}
		if(v.getId() == back.getId()){
			new AlertDialog.Builder(this)
		    .setTitle("You want to leave?!?")
		    .setMessage("You will lose your progress on this magnificent level")
		    .setPositiveButton("Quack", new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int which) { 
					in();
		        }
		     })
		    .setNegativeButton("Nope", new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int which) { 
		            
		        }
		     })
		    .setIcon(android.R.drawable.ic_dialog_alert)
		     .show();}
		}
		

	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}
