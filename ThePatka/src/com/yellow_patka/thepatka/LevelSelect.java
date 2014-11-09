package com.yellow_patka.thepatka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LevelSelect extends Activity implements OnClickListener{
	
	Button lv_1, lv_2, lv_3, lv_4, lv_5, lv_42;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level_select);
		
		lv_1 = (Button) findViewById(R.id.lvl1_btn);
		lv_2 = (Button) findViewById(R.id.lvl2_btn);
		lv_3 = (Button) findViewById(R.id.lvl3_btn);
		lv_4 = (Button) findViewById(R.id.lvl4_btn);
		lv_5 = (Button) findViewById(R.id.lvl5_btn);
		lv_42= (Button) findViewById(R.id.lvl42_btn);
		
		lv_1.setOnClickListener(this);
		lv_2.setOnClickListener(this);
		lv_3.setOnClickListener(this);
		lv_4.setOnClickListener(this);
		
	
	}
	
	@Override
	public void onClick(View v) {
		if(v.getId()== lv_1.getId()){
			throw new RuntimeException("bla");
			//startActivity(new Intent(this, PlayActivity.class));
		}else if(v.getId()== lv_2.getId()){
			startActivity(new Intent(this, Level2Activity.class));
		}else if(v.getId() == lv_3.getId()) {
			startActivity(new Intent(this, Level3Activity.class));
		}else if (v.getId() == lv_4.getId()) {
			startActivity(new Intent(this, Level4Activity.class));
			}
		}

	}

