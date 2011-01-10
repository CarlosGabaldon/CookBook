package com.cookbook.activity_lifecycle;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


public class ActivityExample extends ListActivity {
	
	static final String[] ACTIVITY_CHOICES = new String[] {
		"Open Website Example",
		"Open Contacts",
		"Open Phone Dialer Example",
		"Search Google Example",
		"Start Voice Command"
	};
	
	final String searchTerms = "superman";
	
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1,ACTIVITY_CHOICES));
		getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		getListView().setTextFilterEnabled(true);
		getListView().setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View arg1, 
					int arg2, long arg3){
				
			}
		});
	}
	
}
	
