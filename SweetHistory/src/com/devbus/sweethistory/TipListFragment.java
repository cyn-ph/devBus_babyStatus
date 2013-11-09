package com.devbus.sweethistory;

import java.util.Date;
import java.util.List;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.devbus.controller.Tips;
import com.devbus.data.Tip;

public class TipListFragment extends ListFragment {
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		this.setListAdapter(this.generateAdapter());		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View timeLineView = inflater.inflate(R.layout.time_line, null);
		TextView txtCalendar = (TextView)timeLineView.findViewById(R.id.txtCalendar);
		txtCalendar.setText(new Date().toString());
		return timeLineView;
	}
	
	private ArrayAdapter<Tip> generateAdapter() {		
		Tips tips = new Tips();
		tips.fillList();
		
		//ArrayAdapter<Person> adapter = new ArrayAdapter<Person>(this.getActivity(), R.layout.row_person,R.id.txvPersonName,persons.getPersons());
		ArrayAdapter<Tip> adapter = new TipArrayAdapter(this.getActivity(), R.layout.row_tip, tips.getTips()); 
				
		return adapter;		
	}
	
	public void showDatePickerFragment(){
		/*/ create a new dialog fragment
		//DialogFragment newFragment;
		/try {
			// Gets a new instance of the DatePickerFragment using the
			// actual not after date and create a new DataSetListener
			newFragment = DatePickerFragment
				.newInstance(txtBirthdate.getText().toString()),
					new DatePickerFragment.OnDateSetListener() {
						@Override
						public void onDateSet(Date date) {
							txtBirthdate.setText(DatabaseDictionary.FORMATTER_VIEW.format(date));
						}
					}, true);
			newFragment.show(getSupportFragmentManager(), "datePicker");
		} catch (ParseException e) {
			e.printStackTrace();
		}*/		
	}
	
	//Create a custimized adapter
	public class TipArrayAdapter extends ArrayAdapter<Tip> {

		public TipArrayAdapter(Context context, int resource, List<Tip> objects) {
			super(context, resource, objects);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    	View rowTip = inflater.inflate(R.layout.row_tip, null);
	    	
	    	TextView petName = (TextView)rowTip.findViewById(R.id.tipTitle);
	    	petName.setText(this.getItem(position).getTitle());	    	
	    	
	    	return rowTip;
		}
		
	}


}
