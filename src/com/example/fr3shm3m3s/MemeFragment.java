package com.example.fr3shm3m3s;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MemeFragment extends Fragment {
	
	public final static String ARG_NUMBER ="com.example.fr3shm3m3s.i";
	
	private TextView mTextView;
	
	@Override
    public View onCreateView(LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_meme, container, false);
		Bundle args = getArguments();
		mTextView = (TextView) v.findViewById(R.id.textView);
		mTextView.setText(Integer.toString(args.getInt(ARG_NUMBER)));
		
		return v;
		
	}

}
