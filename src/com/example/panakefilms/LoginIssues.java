package com.example.panakefilms;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;

public class LoginIssues extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		RadioButton password,username,otherissues;
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginissues);
		password=(RadioButton)findViewById(R.id.btnpassword);
		username=(RadioButton)findViewById(R.id.btnusername);
		otherissues=(RadioButton)findViewById(R.id.btnotherissues);
		
	}

}
