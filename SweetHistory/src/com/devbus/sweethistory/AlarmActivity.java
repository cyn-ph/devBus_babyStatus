/**
 * File: AlarmActivity
 * CreationDate: 09/11/13
 * Author: "M. en C. Javier Silva Perez (JSP)"
 * Description: 
 *
 */
package com.devbus.sweethistory;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

/**
 * @author "Cynthia Palma Hernandez"
 * @version 1.0
 * @since 09/11/13
 */
public class AlarmActivity  extends BaseDrawerActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		FrameLayout mainFrame = (FrameLayout) findViewById(R.id.main_frame);
		View v = getLayoutInflater().inflate(R.layout.alarm_activity, null);
		mainFrame.addView(v);
	}
}
