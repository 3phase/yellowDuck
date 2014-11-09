package com.yellow_patka.thepatka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SelectActivity extends Activity implements OnClickListener{

	Button back;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level_select);
		back = (Button) findViewById(R.id.backBtn);
		back.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		if(v.getId() == back.getId()){
			Intent backIntent = new Intent(this, MainActivity.class);
			startActivity(backIntent);
		}
		
	}

	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}
