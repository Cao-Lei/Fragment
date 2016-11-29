package com.example.fragment.fragment;

import com.example.fragment.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

	private TextView f2;
	private View view;

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub

		Log.i("------Fragmen2------", "onAttach");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("------Fragmen2------", "onCreate");
		super.onCreate(savedInstanceState);
	}

	@SuppressLint("NewApi")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("------Fragmen2------", "onCreateView");
		view = inflater.inflate(R.layout.fragment2, null);

		return view;
	}

	@SuppressLint("NewApi")
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("------Fragmen2------", "onActivityCreated");

		super.onActivityCreated(savedInstanceState);

	}

	@Override
	public void onStart() {
		Log.i("------Fragmen2------", "onStart");
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	public void onResume() {
		Log.i("------Fragmen2------", "onResume");
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	public void onPause() {
		Log.i("------Fragmen2------", "onPause");
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.i("------Fragmen2------", "onStop");
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	public void onDestroyView() {
		Log.i("------Fragmen2------", "onDestroyView");
		// TODO Auto-generated method stub
		super.onDestroyView();
	}

	@Override
	public void onDestroy() {
		Log.i("------Fragmen2------", "onDestroy");
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		Log.i("------Fragmen2------", "onDetach");
		// TODO Auto-generated method stub
		super.onDetach();
	}

}
