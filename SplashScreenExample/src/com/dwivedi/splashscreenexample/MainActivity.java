package com.dwivedi.splashscreenexample;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		try {
			VideoView videoHolder = (VideoView)this.findViewById(R.id.videoView1);
 			Uri video = Uri.parse("android.resource://" + getPackageName()
					+ "/" + R.raw.splash);
			videoHolder.setVideoURI(video);

			videoHolder.setOnCompletionListener(new OnCompletionListener() {

				public void onCompletion(MediaPlayer mp) {
					jump();
				}

			});
			videoHolder.start();
		} catch (Exception ex) {
			jump();
		}
	}

	protected void jump() {
 
	   Intent  intent = new Intent(this, HomeActivity.class);
	   startActivity(intent);
	}
}
