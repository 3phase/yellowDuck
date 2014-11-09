package com.yellow_patka.thepatka;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Level2Activity extends Activity implements OnClickListener{

	Button back, submit;
	TextView level, line1,line2,line3,line4,line5,line6,line7,line8;
	int answer;
	String level_txt ="Level 2";
	static boolean[] status = {false, false, false, false, false, false, false, false};
	static int counter;
	public void in(){
		startActivity(new Intent(this, MainActivity.class));
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_level2);
		back = (Button) findViewById(R.id.lvl_2_backBtn);
		back.setOnClickListener(this);
		submit = (Button) findViewById(R.id.lvl_2_submitBtn);
		submit.setOnClickListener(this);
		level = (TextView) findViewById(R.id.lvl_2_Level);
		line1 = (TextView) findViewById(R.id.lvl_2_line1);
		line2 = (TextView) findViewById(R.id.lvl_2_line2);
		line3 = (TextView) findViewById(R.id.lvl_2_line3);
		line4 = (TextView) findViewById(R.id.lvl_2_line4);
		line5 = (TextView) findViewById(R.id.lvl_2_line5);
		line6 = (TextView) findViewById(R.id.lvl_2_line6);
		line7 = (TextView) findViewById(R.id.lvl_2_line7);
		line8 = (TextView) findViewById(R.id.lvl_2_line8);
		level.setText(level_txt);
		line1.setText("#include <iostream>");
		line2.setText("int main(){ ");
		line3.setText("	using namespace std;");
		line4.setText("	unsigned short x = 50;");
		line5.setText("	cout << "+"x was:"+" << x << endl;");
		line6.setText("x + 1;");
		line7.setText("cout << "+"x is now: "+" << x << endl;");	
		line8.setText("}");
		line1.setOnClickListener(this);
		line2.setOnClickListener(this);
		line3.setOnClickListener(this);
		line4.setOnClickListener(this);
		line5.setOnClickListener(this);
		line6.setOnClickListener(this);
		line7.setOnClickListener(this);
		line8.setOnClickListener(this);
		
	}
	
	void selectLine(TextView line, int i){
		status[i] = !status[i];
		if(status[i] == false){
			line.setBackgroundColor(Color.WHITE);
			counter--;
			//answer = i;
		}else{
			line.setBackgroundColor(Color.MAGENTA);
			counter++;
			if(i==7){
				answer = i;
			}
		}
	}
	
	@Override
	public void onClick(View v) {
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
		     .show();
		}else if(v.getId() == line1.getId()){
			selectLine(line1, 0);
		}else if(v.getId() == line2.getId()){
			selectLine(line2, 1);
		}else if(v.getId() == line3.getId()){
			selectLine(line3, 2);
		}else if(v.getId() == line4.getId()){
			selectLine(line4, 3);
		}else if(v.getId() == line5.getId()){
			selectLine(line5, 4);
		}else if(v.getId() == line6.getId()){
			selectLine(line6, 5);
		}else if(v.getId() == line7.getId()){
			selectLine(line7, 6);
		}else if(v.getId() == line8.getId()){
			selectLine(line8, 7);
		}else if(v.getId() == submit.getId()){
			if(counter == 1 &&  answer == 7){
				Toast ok = Toast.makeText(this, "Level Complete!!!", Toast.LENGTH_SHORT);
				ok.show();
				SharedPreferences sp = getSharedPreferences("your_prefs", Activity.MODE_PRIVATE);
				SharedPreferences.Editor editor = sp.edit();
				editor.putInt("level", 2);
				editor.commit();
				startActivity(new Intent(this, Level3Activity.class));
			}else if(counter > 1){
				Toast xok = Toast.makeText(this, "Too much errors", Toast.LENGTH_SHORT);
				xok.show();
			}else if (answer != 7){
				Toast xxok = Toast.makeText(this, "This is not error", Toast.LENGTH_SHORT);
				xxok.show();
			}
		}	
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		
	}
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}
