package com.yellow_patka.thepatka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PlayActivity extends Activity implements OnClickListener{

	Button back;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_play);
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
}
