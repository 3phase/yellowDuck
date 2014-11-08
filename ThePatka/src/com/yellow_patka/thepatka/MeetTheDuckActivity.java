package com.yellow_patka.thepatka;

import android.app.Activity;
import android.os.Bundle;

public class MeetTheDuckActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_meet_the_duck);

	}

	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}
