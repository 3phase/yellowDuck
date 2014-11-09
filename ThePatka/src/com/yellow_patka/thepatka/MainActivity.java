package com.yellow_patka.thepatka;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	
	Button play;
	Button cont;
	Button levels;
	Button mtd;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		play = (Button)findViewById(R.id.play_btn);
		cont = (Button)findViewById(R.id.cont_btn);
		levels = (Button)findViewById(R.id.select_btn);
		mtd = (Button)findViewById(R.id.mtd_btn);
		play.setOnClickListener(this);
		cont.setOnClickListener(this);
		levels.setOnClickListener(this);
		mtd.setOnClickListener(this);
		
	
	}

	@Override
	public void onClick(View v) {
		if(v.getId()==play.getId()){
			startActivity(new Intent(this, PlayActivity.class));
		}else if(v.getId()==mtd.getId()){
			startActivity(new Intent(this, MeetTheDuckActivity.class));
		}else if(v.getId() == levels.getId()) {
			startActivity(new Intent(this, SelectActivity.class));
		}else if (v.getId() == cont.getId()) {
			SharedPreferences sp = getSharedPreferences("your_prefs", Activity.MODE_PRIVATE);
			int level = sp.getInt("level", -1)+1;
			switch (level) {
			case 1:
				startActivity(new Intent(this, PlayActivity.class));
				break;
			case 2:
				startActivity(new Intent(this, Level2Activity.class));
				break;
			case 3:
				startActivity(new Intent(this, Level3Activity.class));
				break;
			case 4:
				startActivity(new Intent(this, Level4Activity.class));
				break;
			default:
				break;
			}
		}
	}

	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}
