package com.rnask;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// Window window = activity.getWindow();
		// Activity activity;
		// activity.getWindow().setStatusBarColor(activity.getResources().getColor(R.color.blue));
		// window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
		// window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		// window.setStatusBarColor(activity.getResources().getColor(R.color.blue));
		super.onCreate(savedInstanceState);
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
		finish();
	}
}
