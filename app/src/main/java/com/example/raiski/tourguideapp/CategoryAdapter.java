package com.example.raiski.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
	final int PAGE_COUNT = 4;
	private Context mContext;

	public CategoryAdapter(Context context, FragmentManager fm) {
		super(fm);
		mContext = context;
	}

	@Override
	public Fragment getItem(int position) {
		if (position == 0) {
			return new FoodsFragment();
		} else if (position == 1) {
			return new MallsFragment();
		} else if (position == 2) {
			return new SportsFragment();
		} else {
			return new SightsFragment();
		}
	}

	@Override
	public int getCount() {
		return PAGE_COUNT;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		if (position == 0) {
			return mContext.getString(R.string.foods);
		} else if (position == 1) {
			return mContext.getString(R.string.malls);
		} else if (position == 2) {
			return mContext.getString(R.string.sports);
		} else {
			return mContext.getString(R.string.sights);
		}
	}

}
