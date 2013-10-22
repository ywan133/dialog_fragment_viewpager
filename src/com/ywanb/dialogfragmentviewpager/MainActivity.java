package com.ywanb.dialogfragmentviewpager;

import com.actionbarsherlock.app.SherlockFragmentActivity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

public class MainActivity extends SherlockFragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void onClick(View v) {
		FragmentManager fragManager = this.getSupportFragmentManager();

		FragmentTransaction fTransaction = fragManager.beginTransaction();

		fTransaction.add(new MyDialogFrag(), "dialog");
		fTransaction.commit();
	}

}
