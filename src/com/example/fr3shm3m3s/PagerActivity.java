package com.example.fr3shm3m3s;

import android.annotation.TargetApi;
import android.app.ActionBar.TabListener;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class PagerActivity extends FragmentActivity {
	Fr3shM3m3sPagerAdapter mFreshMemePagerAdapter;
	ViewPager mViewPager;
	
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		final android.app.ActionBar actionBar = getActionBar();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pager);
		
		mFreshMemePagerAdapter = new Fr3shM3m3sPagerAdapter(getSupportFragmentManager());
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
			
			@Override
			public void onPageSelected(int position){
				getActionBar().setSelectedNavigationItem(position);
			}
			
		});
		mViewPager.setAdapter(mFreshMemePagerAdapter);
		
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		 TabListener tabListener = new TabListener() {
		       

				@Override
				public void onTabReselected(android.app.ActionBar.Tab tab,
						android.app.FragmentTransaction ft) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onTabSelected(android.app.ActionBar.Tab tab,
						android.app.FragmentTransaction ft) {
					
					mViewPager.setCurrentItem(tab.getPosition());
				}

				@Override
				public void onTabUnselected(android.app.ActionBar.Tab tab,
						android.app.FragmentTransaction ft) {
					
				}
		    };


		
		for(int i = 0; i < 5; i++){
			actionBar.addTab(actionBar.newTab().setText("Tab " + (i + 1)).setTabListener(tabListener));
			
		}

		
	}
	
	public class Fr3shM3m3sPagerAdapter extends FragmentStatePagerAdapter {

		public Fr3shM3m3sPagerAdapter(FragmentManager fm) {
			super(fm);
			
		}

		@Override
		public Fragment getItem(int i) {
			Fragment fragment;
			switch(i){
			case 0:
				fragment = new MemeFragment();
				break;
			case 1:
				fragment = new SecondMemeFragment();
				break;
			default:
				fragment = new MemeFragment();
				break;
			}
			
			Bundle args = new Bundle();
			args.putInt(MemeFragment.ARG_NUMBER, i +1);
			fragment.setArguments(args);
			return fragment;
			
		}

		@Override
		public int getCount() {
			
			return 5;
		}
		
	}

}


