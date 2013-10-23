package com.ywanb.dialogfragmentviewpager;

import com.actionbarsherlock.app.SherlockFragmentActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

	public void onClickDialog(View v) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);

		builder.setTitle("TESTING");
		LayoutInflater inflater = (LayoutInflater) this
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		View root = inflater.inflate(R.layout.dialog_list_view,
				(ViewGroup) findViewById(R.id.root));

		builder.setView(root);

		AlertDialog dialog = builder.create();
		dialog.show();

	}
}
