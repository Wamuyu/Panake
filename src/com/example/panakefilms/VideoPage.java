package com.example.panakefilms;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

public class VideoPage extends TabActivity implements OnTabChangeListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		TabHost thpanake;
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.videopage);
		
		thpanake=(TabHost)findViewById(android.R.id.tabhost);
		thpanake.setup();
		thpanake.setOnTabChangedListener(this);
		
		TabSpec tab1= thpanake.newTabSpec("");
		TabSpec tab2= thpanake.newTabSpec("");
		TabSpec tab3= thpanake.newTabSpec("");
		
		tab1.setIndicator("Comedy",null);
		tab2.setIndicator("Action",null);
		tab3.setIndicator("Science Fiction",null);
		
		tab1.setContent(new Intent(this,SpinnerCustomizationActivity.class));
		tab2.setContent(new Intent(this,SpinnerCustomizationActivity.class));
		tab3.setContent(new Intent(this,SpinnerCustomizationActivity.class));
		
		thpanake.addTab(tab1);
		thpanake.addTab(tab2);
		thpanake.addTab(tab3);
		
		
	}
	@Override
	public void onTabChanged(String arg0) {
		// TODO Auto-generated method stub
		
	}

}
