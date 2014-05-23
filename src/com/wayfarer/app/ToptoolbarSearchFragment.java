package com.wayfarer.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ToptoolbarSearchFragment extends Fragment
{
 	public ToptoolbarSearchFragment(){}
		
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		return inflater.inflate(R.layout.toptoolbar_search_frag, container, false);
	}

}