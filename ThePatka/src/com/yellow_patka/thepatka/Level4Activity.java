package com.yellow_patka.thepatka;

import java.util.Arrays;

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

public class Level4Activity extends Activity implements OnClickListener{

	Button back, submit;
	TextView level, line1,line2,line3,line4,line5,line6,line7,line8,line9,line10,line11,line12,line13,line14,line15,line16,line17,line18,line19,line20,line21,line22,line23,line24;
	int[] answer = new int[3];
	int[] patka = new int[3];
	int c = 0;
	String level_txt ="Level 4";
	boolean[] status = new boolean[24];
	static int counter;
	
	public void in(){
		startActivity(new Intent(this, MainActivity.class));
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_level4);
		for(int c = 0; c<24; c++){
		 status[c] = false;
		}
		back = (Button) findViewById(R.id.lvl_4_backBtn);
		back.setOnClickListener(this);
		submit = (Button) findViewById(R.id.lvl_4_submitBtn);
		submit.setOnClickListener(this);
		level = (TextView) findViewById(R.id.lvl_4_Level);
		line1 = (TextView) findViewById(R.id.lvl_4_line1);
		line2 = (TextView) findViewById(R.id.lvl_4_line2);
		line3 = (TextView) findViewById(R.id.lvl_4_line3);
		line4 = (TextView) findViewById(R.id.lvl_4_line4);
		line5 = (TextView) findViewById(R.id.lvl_4_line5);
		line6 = (TextView) findViewById(R.id.lvl_4_line6);
		line7 = (TextView) findViewById(R.id.lvl_4_line7);
		line8 = (TextView) findViewById(R.id.lvl_4_line8);
		line9 = (TextView) findViewById(R.id.lvl_4_line9);
		line10 = (TextView) findViewById(R.id.lvl_4_line10);
		line11 = (TextView) findViewById(R.id.lvl_4_line11);
		line12 = (TextView) findViewById(R.id.lvl_4_line12);
		line13 = (TextView) findViewById(R.id.lvl_4_line13);
		line14 = (TextView) findViewById(R.id.lvl_4_line14);
		line15 = (TextView) findViewById(R.id.lvl_4_line15);
		line16 = (TextView) findViewById(R.id.lvl_4_line16);
		line17 = (TextView) findViewById(R.id.lvl_4_line17);
		line18 = (TextView) findViewById(R.id.lvl_4_line18);
		line19 = (TextView) findViewById(R.id.lvl_4_line19);
		line20 = (TextView) findViewById(R.id.lvl_4_line20);
		line21 = (TextView) findViewById(R.id.lvl_4_line21);
		line22 = (TextView) findViewById(R.id.lvl_4_line22);
		line23 = (TextView) findViewById(R.id.lvl_4_line23);
		line24 = (TextView) findViewById(R.id.lvl_4_line24);
		level.setText(level_txt);
		line1.setText("#include <iostream>");
		line2.setText("using namespace std;");
		line3.setText("int main () {");
		line4.setText("	unsigned long long sum_arr[10],curr_N=1;");
		line5.setText("	int x;");
		line6.setText("	cin>>x;");
		line7.setText("	if(x<0 || x>9){");
		line8.setText("	  return 0;");
		line9.setText("	}");
		line10.setText(" for(int i=0;i<10;i++){");
		line11.setText("   sum_arr[i]=0");
		line12.setText(" }");
		line13.setText(" for((int i=0;i<10;i++){");
		line14.setText("   while(curr_N%x!=0){");
		line15.setText("     sum_arr[i]+=curr_N;");
		line16.setText("     curr_N++;");
		line17.setText("   }");
		line18.setText("   curr_N++;");
		line19.setText(" }");
		line20.setText(" for(int i=0;i<10;i++){");
		line21.setText("   cout<sum_arr[i]<"+"endl"+";");
		line22.setText(" }");
		line23.setText(" return 0");
		line24.setText("}");
		line1.setOnClickListener(this);
		line2.setOnClickListener(this);
		line3.setOnClickListener(this);
		line4.setOnClickListener(this);
		line5.setOnClickListener(this);
		line6.setOnClickListener(this);
		line7.setOnClickListener(this);
		line8.setOnClickListener(this);
		line9.setOnClickListener(this);
		line10.setOnClickListener(this);
		line11.setOnClickListener(this);
		line12.setOnClickListener(this);
		line13.setOnClickListener(this);
		line14.setOnClickListener(this);	
		line15.setOnClickListener(this);
		line16.setOnClickListener(this);
		line17.setOnClickListener(this);
		line18.setOnClickListener(this);
		line19.setOnClickListener(this);
		line20.setOnClickListener(this);
		line21.setOnClickListener(this);
		line22.setOnClickListener(this);
		line23.setOnClickListener(this);
		line24.setOnClickListener(this);
	}
	
	void selectLine(TextView line, int i){
		if(c>2){
			c=0;
		}
		status[i] = !status[i];
		if(status[i] == false){
			line.setBackgroundColor(Color.WHITE);
			counter--;
			//answer = i;
		}else{
			line.setBackgroundColor(Color.MAGENTA);
			counter++;
			if(i==10 || i==12 || i==20){
				answer[c] = i; 
				c++;
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
		}else if(v.getId() == line9.getId()){
			selectLine(line9, 8);
		}else if(v.getId() == line10.getId()){
			selectLine(line10, 9);
		}else if(v.getId() == line11.getId()){
			selectLine(line11, 10);
		}else if(v.getId() == line12.getId()){
			selectLine(line12, 11);
		}else if(v.getId() == line13.getId()){
			selectLine(line13, 12);
		}else if(v.getId() == line14.getId()){
			selectLine(line14, 13);
		}else if(v.getId() == line15.getId()){
			selectLine(line15, 14);
		}else if(v.getId() == line16.getId()){
			selectLine(line16, 15);
		}else if(v.getId() == line17.getId()){
			selectLine(line17, 16);
		}else if(v.getId() == line18.getId()){
			selectLine(line18, 17);
		}else if(v.getId() == line19.getId()){
			selectLine(line19, 18);
		}else if(v.getId() == line20.getId()){
			selectLine(line20, 19);
		}else if(v.getId() == line21.getId()){
			selectLine(line21, 20);
		}else if(v.getId() == line22.getId()){
			selectLine(line22, 21);
		}else if(v.getId() == line23.getId()){
			selectLine(line23, 22);
		}else if(v.getId() == line24.getId()){
			selectLine(line24, 23);
		}else if(v.getId() ==submit.getId()){			
			patka[0]=10;
			patka[1]=12;
			patka[2]=20;
			Arrays.sort(answer);
			if((Arrays.equals(answer, patka)) && counter==3){
				Toast ok = Toast.makeText(this, "Level Complete!!!", Toast.LENGTH_SHORT);
				ok.show();
				SharedPreferences sp = getSharedPreferences("your_prefs", Activity.MODE_PRIVATE);
				SharedPreferences.Editor editor = sp.edit();
				editor.putInt("level", 7);
				editor.commit();
				startActivity(new Intent(this, MainActivity.class));
			}else if(counter > 3){
				Toast xok = Toast.makeText(this, "Too much errors", Toast.LENGTH_SHORT);
				xok.show();
			}else {
				Toast xxok = Toast.makeText(this, "This is not error", Toast.LENGTH_SHORT);
				xxok.show();
			}
		}
	}

	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}
