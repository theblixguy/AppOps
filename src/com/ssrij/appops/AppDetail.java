package com.ssrij.appops;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.android.settings.applications.AppOpsDetails;

public class AppDetail extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (savedInstanceState == null) {
		AppOpsDetails appopsdetails = new AppOpsDetails();
        Log.e("AppOps", (new StringBuilder("AppDetail.onCreate: ")).append(getIntent().getExtras().getString("package")).toString());
        appopsdetails.setArguments(getIntent().getExtras());
        getFragmentManager().beginTransaction().add(0x1020002, appopsdetails).commit();

	} }

}
