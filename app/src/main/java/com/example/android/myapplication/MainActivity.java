package com.example.android.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button btnFadeIn, btnFadeOut, btnCrossFade, btnBlink, btnZoomIn,
			btnZoomOut, btnRotate, btnMove, btnSlideUp, btnSlideDown,
			btnBounce, btnSequential, btnTogether;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnFadeIn = (Button) findViewById(R.id.btnFadeIn);
		btnFadeOut = (Button) findViewById(R.id.btnFadeOut);
		btnCrossFade = (Button) findViewById(R.id.btnCrossFade);
		btnBlink = (Button) findViewById(R.id.btnBlink);
		btnZoomIn = (Button) findViewById(R.id.btnZoomIn);
		btnZoomOut = (Button) findViewById(R.id.btnZoomOut);
		btnRotate = (Button) findViewById(R.id.btnRotate);
		btnMove = (Button) findViewById(R.id.btnMove);
		btnSlideUp = (Button) findViewById(R.id.btnSlideUp);
		btnSlideDown = (Button) findViewById(R.id.btnSlideDown);
		btnBounce = (Button) findViewById(R.id.btnBounce);
		btnSequential = (Button) findViewById(R.id.btnSequential);
		btnTogether = (Button) findViewById(R.id.btnTogether);

		/*
		 * Buttons click events
		 */

		// fade in
		btnFadeIn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, FadeInActivity.class);
				startActivity(i);
			}
		});

		// fade out
		btnFadeOut.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, FadeOutActivity.class);
				startActivity(i);
			}
		});

		// cross fade
		btnCrossFade.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this,
						CrossfadeActivity.class);
				startActivity(i);
			}
		});

		// blink
		btnBlink.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, BlinkActivity.class);
				startActivity(i);
			}
		});

		// Zoom In
		btnZoomIn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, ZoomInActivity.class);
				startActivity(i);
			}
		});

		// Zoom Out
		btnZoomOut.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, ZoomOutActivity.class);
				startActivity(i);
			}
		});

		// Rotate
		btnRotate.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, RotateActivity.class);
				startActivity(i);
			}
		});

		// Move
		btnMove.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, MoveActivity.class);
				startActivity(i);
			}
		});

		// Slide Up
		btnSlideUp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, SlideUpActivity.class);
				startActivity(i);
			}
		});

		// Slide Down
		btnSlideDown.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this,
						SlideDownActivity.class);
				startActivity(i);
			}
		});

		// Slide Down
		btnBounce.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, BounceActivity.class);
				startActivity(i);
			}
		});

		// Sequential
		btnSequential.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this,
						SequentialActivity.class);
				startActivity(i);
			}
		});
		

		// Together
		btnTogether.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this,
						TogetherActivity.class);
				startActivity(i);
			}
		});

	}
}
