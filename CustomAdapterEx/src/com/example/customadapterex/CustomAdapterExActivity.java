package com.example.customadapterex;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class CustomAdapterExActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
final Context context = CustomAdapterExActivity.this;
    
    	ListView ls2 = new ListView(context);
     	
     	
     	// clear previous results in the LV
    	ls2.setAdapter(null);        
   		// populate
    	ArrayList<Device> m_Devices = new ArrayList<Device>();
   		Device device;
	        for (int i=0;i<10;i++) {
	        device = new Device("Network Device "+i,"13:B4:5C:0D:AE:67", i%2,0, 100 + i);
	        m_Devices.add(device);
	        }
        CustomAdapter lvAdapter =  new CustomAdapter(context, m_Devices);
        ls2.setAdapter(lvAdapter);
        ls2.setOnItemClickListener(new OnItemClickListener() 
        {
        	public void onItemClick(AdapterView<?> arg0, View arg1,int arg2, long arg3) 
        	{
        		Toast.makeText(getBaseContext(), "You clicked on "+arg2, Toast.LENGTH_LONG).show();
    		}
    	});
         
         setContentView(ls2);
	}


}
