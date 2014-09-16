package com.example.panakefilms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoginPage extends Activity{
	TextView forgotpass;
	EditText password, username;
	ImageButton fb,twitter,gmail;
	Button login;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginpage);
		forgotpass=(TextView)findViewById(R.id.textviewpassword);
		forgotpass.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent psf=new Intent(getApplicationContext(),LoginIssues.class);
				startActivity(psf);
				
			}
		});
		
		login=(Button)findViewById(R.id.buttonsignin);
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent login = new Intent(getApplicationContext(),VideoPage.class);
				startActivity(login);
				
			}
		});
		
		
	}

}
