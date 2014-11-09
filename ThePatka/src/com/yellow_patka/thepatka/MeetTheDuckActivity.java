package com.yellow_patka.thepatka;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MeetTheDuckActivity extends Activity implements OnClickListener {
	
	Button back;
	ImageView iv1, iv2;
	MediaPlayer mp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_meet_the_duck);
		back = (Button) findViewById(R.id.backBtn);
		iv1 = (ImageView) findViewById(R.id.imageView1);
		iv2 = (ImageView) findViewById(R.id.imageView2);
		back.setOnClickListener(this);
		
		SharedPreferences sp = getSharedPreferences("your_prefs", Activity.MODE_PRIVATE);
		int level = sp.getInt("level", -1);
	
		
		switch(level){
		case 7:
			iv2.setImageResource(R.drawable.lv7);
		case 6:
			iv1.setImageResource(R.drawable.lv6);
			break;
		case 5:
			iv2.setImageResource(R.drawable.lv5);
		case 4:
			iv1.setImageResource(R.drawable.lv4);
			break;
		case 3:
			iv2.setImageResource(R.drawable.lv3);	
		case 2:
			iv1.setImageResource(R.drawable.lv2);
			break;
		case 1:
			iv1.setImageResource(R.drawable.lv1_2);
			break;
		default:
			iv1.setImageResource(R.drawable.lv1_2);
			iv2.setImageResource(R.drawable.lv1_1);
			break;
		}
		mp = MediaPlayer.create(this, R.raw.quack);
        iv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp.start();
            }
        });
	}

	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onClick(View v) {
		if(v.getId() == back.getId()){
			Intent backIntent = new Intent(this, MainActivity.class);
			startActivity(backIntent);
		}	
	}	
}