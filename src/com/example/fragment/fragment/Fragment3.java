package com.example.fragment.fragment;

import com.example.fragment.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment3 extends Fragment {

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub

		Log.i("------Fragment3------", "onAttach");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("------Fragment3------", "onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("------Fragment3------", "onCreateView");
		View view = inflater.inflate(R.layout.fragment3, null);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("------Fragment3------", "onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {
		Log.i("------Fragment3------", "onStart");
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	public void onResume() {
		Log.i("------Fragment3------", "onResume");
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	public void onPause() {
		Log.i("------Fragment3------", "onPause");
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.i("------Fragment3------", "onStop");
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	public void onDestroyView() {
		Log.i("------Fragment3------", "onDestroyView");
		// TODO Auto-generated method stub
		super.onDestroyView();
	}

	@Override
	public void onDestroy() {
		Log.i("------Fragment3------", "onDestroy");
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		Log.i("------Fragment3------", "onDetach");
		// TODO Auto-generated method stub
		super.onDetach();
	}


}
