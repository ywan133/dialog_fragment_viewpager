package com.ywanb.dialogfragmentviewpager;

import java.util.ArrayList;

import com.viewpagerindicator.UnderlinePageIndicator;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyDialogFrag extends DialogFragment {

	private ViewPager pager;
	private UnderlinePageIndicator indicator;
	private MyAdapter adapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setStyle(STYLE_NO_TITLE, 0);
	}

	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_dialog, container,
				false);

		pager = (ViewPager) rootView.findViewById(R.id.pager);
		indicator = (UnderlinePageIndicator) rootView
				.findViewById(R.id.indicator);

		adapter = new MyAdapter(this.getChildFragmentManager());
		pager.setAdapter(adapter);
		indicator.setViewPager(pager);
		indicator.setFades(false);

		return rootView;
	}

	private class MyAdapter extends FragmentStatePagerAdapter {

		private ArrayList<RequestFragment> frags;

		public MyAdapter(FragmentManager fm) {
			super(fm);

			frags = new ArrayList<RequestFragment>();
			frags.add(new RequestFragment());
			frags.add(new RequestFragment());
			frags.add(new RequestFragment());
			frags.add(new RequestFragment());
			frags.add(new RequestFragment());
			frags.add(new RequestFragment());
		}

		@Override
		public Fragment getItem(int arg0) {
			return frags.get(arg0);
		}

		@Override
		public int getCount() {
			return frags.size();
		}

	}

}
