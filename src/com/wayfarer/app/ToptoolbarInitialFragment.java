package com.wayfarer.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ToptoolbarInitialFragment extends Fragment
{
 	public ToptoolbarInitialFragment(){}
		
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		return inflater.inflate(R.layout.toptoolbar_initial_frag, container, false);
	}

}