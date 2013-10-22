package com.ywanb.dialogfragmentviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;

public class RequestFragment extends SherlockFragment{

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

			View rootView = inflater.inflate(R.layout.fragment_request, container, false);
			
			return rootView;
		
	}
	
	
	
	
	
	
	

}
