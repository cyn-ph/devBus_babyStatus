package com.devbus.sweethistory;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FormElementActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		String typeElement = "event";
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.form_element);
		ImageView imgFormElement = (ImageView)this.findViewById(R.id.imgFormElement);
		TextView txtFormElement = (TextView)this.findViewById(R.id.txtFormElement);
		
		if(typeElement.compareTo("event") == 0){//Event
			imgFormElement.setImageResource(R.drawable.evento);
			txtFormElement.setText("EVENTO");
		}else{//Sintom
			imgFormElement.setImageResource(R.drawable.sintoma);
			txtFormElement.setText("SINTOMA");			
		}
	}

}