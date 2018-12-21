package com.example.android.jokelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class JokeLibraryActivity extends AppCompatActivity {

	public static final String EXTRA_JOKE_TEXT = "joke-text";
	private TextView mJokeDisplayTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_joke_library);

		if (savedInstanceState == null) {
			Intent intentFromCallingActivity = getIntent();
			if (intentFromCallingActivity != null && intentFromCallingActivity.hasExtra(EXTRA_JOKE_TEXT)) {
				String jokeTextFromIntent = intentFromCallingActivity.getStringExtra(EXTRA_JOKE_TEXT);

				mJokeDisplayTextView = findViewById(R.id.tv_joke_display);

				mJokeDisplayTextView.setText(jokeTextFromIntent);
				Toast.makeText(this, "joke is: " + jokeTextFromIntent, Toast.LENGTH_SHORT).show();

			} else {
				Toast.makeText(this, "Oops! No joke available!", Toast.LENGTH_LONG).show();
				finish();
			}
		}
	}
}
