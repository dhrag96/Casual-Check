package com.example.casualcheck;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home2 extends Activity implements View.OnClickListener{
	Button button1,button2,button3,button4;
	public static String mleter;
	public static String text="D";

	@Override

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abc1);
		button1=(Button)findViewById(R.id.button2);
		button2=(Button)findViewById(R.id.button1);
		button3=(Button)findViewById(R.id.button3);
		button4=(Button)findViewById(R.id.button4);
		button1.setText("A");
		button2.setText("B");
		button3.setText("C");
		button4.setText("D");
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==this.button1) {
			mleter=button1.getText().toString();
		}
		else if(v==this.button2)
		{
			mleter=button2.getText().toString();
		}
		else if(v==this.button3){
			mleter=button3.getText().toString();
		}
		else
		{
			mleter=button4.getText().toString();

		}
		if(text.equalsIgnoreCase(mleter))
		{

			Intent mIntent=new Intent(home2.this,home23.class);
			startActivity(mIntent);
		}
		else
		{
			Intent mIntent=new Intent(home2.this,efficiency.class);
			String eff1="15%";
			mIntent.putExtra("eff", eff1);
			startActivity(mIntent);
			
		}
	}



}


