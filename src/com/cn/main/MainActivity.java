package com.cn.main;

import pl.droidsonroids.gif.AnimationListener;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.android_gifbug.R;

public class MainActivity extends Activity {

	private GifDrawable gbDrawable;
	private GifImageView gvView;
	

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gvView = (GifImageView) findViewById(R.id.gif_image);
		try {
			gbDrawable = new GifDrawable(this.getResources(), R.drawable.callicongif);
			gbDrawable.setLoopCount(1);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		gbDrawable.addAnimationListener(new AnimationListener() {
			@Override
			public void onAnimationCompleted() {
				Log.e("finish", " finish  to  gif ");
				gbDrawable.reset();
				gbDrawable.setLoopCount(1);
			}
		});
		gvView.setImageDrawable(gbDrawable);
	}

}
