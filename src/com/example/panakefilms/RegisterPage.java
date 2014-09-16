package com.example.panakefilms;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterPage extends Activity {
	
	EditText username,password,password_reenter;
	Button submit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.registerpage);
		submit=(Button)findViewById(R.id.buttonsubmit);
		username=(EditText)findViewById(R.id.edittextusername);
		password=(EditText)findViewById(R.id.registerpassword);
		password_reenter=(EditText)findViewById(R.id.passwordrepeat);
	}

}
