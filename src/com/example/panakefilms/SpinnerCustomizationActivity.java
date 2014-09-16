package com.example.panakefilms;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerCustomizationActivity extends Activity {
	String[] spinnerValues = { "Blur", "NFS", "Burnout","GTA IV", "Racing", };

	String[] spinnerSubs = { "Ultimate Game", "Need for Speed",
			"Ulimate Racing", "Rockstar Games", "Thunder Bolt" };

	int total_images[] = { R.drawable.one, R.drawable.two, R.drawable.three,
			R.drawable.four, R.drawable.five, R.drawable.six };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spinnermainactivity);
        //find the spinner
		Spinner mySpinner = (Spinner) findViewById(R.id.spinner_show);
		//set a custom adapter -see below class - Custom adapter has presentation and datasource
		
		mySpinner.setAdapter(new MyAdapter(this, R.layout.custom_spinner,
				spinnerValues));
		mySpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}
	
	//this is an adapter only - it uses custom_spinner.xml
	public class MyAdapter extends ArrayAdapter<String> {

		public MyAdapter(Context ctx, int txtViewResourceId, String[] objects) {
			super(ctx, txtViewResourceId, objects);
		}

		@Override
		public View getDropDownView(int position, View cnvtView, ViewGroup prnt) {
			return getCustomView(position, cnvtView, prnt);
		}

		@Override
		public View getView(int pos, View cnvtView, ViewGroup prnt) {
			return getCustomView(pos, cnvtView, prnt);
		}

		public View getCustomView(int position, View convertView,
				ViewGroup parent) {

			LayoutInflater inflater = getLayoutInflater();
			View mySpinner = inflater.inflate(R.layout.custom_spinner, parent,
					false);
			//access image view, textviews form custom_spinner.xml
			TextView main_text = (TextView) mySpinner
					.findViewById(R.id.text_main_seen);
			main_text.setText(spinnerValues[position]);

			TextView subSpinner = (TextView) mySpinner
					.findViewById(R.id.sub_text_seen);
			subSpinner.setText(spinnerSubs[position]);

			ImageView left_icon = (ImageView) mySpinner
					.findViewById(R.id.left_pic);
			left_icon.setImageResource(total_images[position]);

			return mySpinner;//return custom spinner
		}
	}
}