package com.example.fragment.activity;

import com.example.fragment.R;
import com.example.fragment.fragment.Fragment1;
import com.example.fragment.fragment.Fragment2;
import com.example.fragment.fragment.Fragment3;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements OnClickListener {

	private Fragment1 f1;
	private Fragment2 f2;
	private Fragment3 f3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("------Acrivity------", "onCreate");
		findViewById(R.id.btn1).setOnClickListener(this);
		findViewById(R.id.btn2).setOnClickListener(this);
		findViewById(R.id.btn3).setOnClickListener(this);

		FragmentManager manager = getSupportFragmentManager();
		FragmentTransaction ft = manager.beginTransaction();
		ft.replace(R.id.fr, new Fragment1());
		ft.commit();

	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.btn1:
			FragmentTransaction transaction = getSupportFragmentManager()
			.beginTransaction();
			Fragment1 f1 = new Fragment1();
			Bundle bundle = new Bundle();
//			String name = (String) btn1.getText();
			String name="sgsgs";
			bundle.putString("name", name);
			f1.setArguments(bundle);
			transaction.replace(R.id.fr, f1);
			transaction.commit();
			break;
		case R.id.btn2:
			FragmentTransaction fragmentManager2 = getSupportFragmentManager()
					.beginTransaction();
			Fragment2 f2 = new Fragment2();
			fragmentManager2.hide(f2);
			fragmentManager2.commit();
			break;
		case R.id.btn3:
			FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
			Fragment3 f3 = new Fragment3();
			transaction1.remove(f3);
			transaction1.commit();
			break;

		default:
			break;
		}

	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		Log.i("------Acrivity------", "onStart");
		super.onStart();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		Log.i("------Acrivity------", "onRestart");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		Log.i("------Acrivity------", "onResume");
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		Log.i("------Acrivity------", "onPause");
		super.onPause();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		Log.i("------Acrivity------", "onStop");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("------Acrivity------", "onDestroy");
		super.onDestroy();
	}

}
