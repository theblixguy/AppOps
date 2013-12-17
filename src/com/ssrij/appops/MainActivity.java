package com.ssrij.appops;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.android.settings.applications.AppOpsSummary;

public class MainActivity extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (savedInstanceState == null) {
		 AppOpsSummary appopssummary = new AppOpsSummary();
         appopssummary.setArguments(getIntent().getExtras());
         getFragmentManager().beginTransaction().add(0x1020002, appopssummary).commit();
	} }
	
	@Override
    protected boolean isValidFragment (String fragmentName) { return true; }

}
