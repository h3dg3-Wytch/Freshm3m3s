package com.example.fr3shm3m3s;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondMemeFragment extends Fragment {
	
	private TextView mTextView;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
		View v = inflater.inflate(R.layout.fragment_second_meme, parent, false);
		Bundle args = getArguments();
		mTextView = (TextView) v.findViewById(R.id.textView);
		mTextView.setText("Twerk");
		return v;
		
	}

}
