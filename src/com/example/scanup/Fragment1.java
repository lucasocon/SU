package com.example.scanup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {
	
	public View onCreatedView(
			LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState){
		
		return inflater.inflate(R.layout.fragment_1, container, false);
		
	}
}
