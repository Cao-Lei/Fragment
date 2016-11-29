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

public class Fragment1 extends Fragment {

	private TextView f1;

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub

		Log.i("------Fragment1------", "onAttach");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("------Fragment1------", "onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("------Fragment1------", "onCreateView");
		View view = inflater.inflate(R.layout.fragment1, null);
		f1 = (TextView) view.findViewById(R.id.f1);
		
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("------Fragment1------", "onActivityCreated");
//		Bundle bundle = getArguments();
//		System.out.println(bundle.toString());
//		String name = bundle.getString("name");
//		f1.setText(name);		

		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {
		Log.i("------Fragment1------", "onStart");
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	public void onResume() {
		Log.i("------Fragment1------", "onResume");
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	public void onPause() {
		Log.i("------Fragment1------", "onPause");
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.i("------Fragment1------", "onStop");
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	public void onDestroyView() {
		Log.i("------Fragment1------", "onDestroyView");
		// TODO Auto-generated method stub
		super.onDestroyView();
	}

	@Override
	public void onDestroy() {
		Log.i("------Fragment1------", "onDestroy");
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		Log.i("------Fragment1------", "onDetach");
		// TODO Auto-generated method stub
		super.onDetach();
	}

}
