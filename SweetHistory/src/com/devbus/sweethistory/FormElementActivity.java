package com.devbus.sweethistory;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FormElementActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String typeElement = this.getIntent().getStringExtra("TYPE_ELEMENT");
		
		setContentView(R.layout.form_element);
		ImageView imgFormElement = (ImageView)this.findViewById(R.id.imgFormElement);
		TextView txtFormElement = (TextView)this.findViewById(R.id.txtFormElement);
		LinearLayout linearLayout =  (LinearLayout)this.findViewById(R.id.imgBackground);
		
		if(typeElement.compareTo("event") == 0){//Event
			imgFormElement.setImageResource(R.drawable.evento);
			linearLayout.setBackgroundResource(R.drawable.circle_evento);
			txtFormElement.setText("EVENTO");
		}else{//Sintom
			imgFormElement.setImageResource(R.drawable.sintoma);
			txtFormElement.setText("SINTOMA");
			linearLayout.setBackgroundResource(R.drawable.circle_sintoma);
		}
	}

}