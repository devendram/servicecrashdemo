package com.udgama.demo;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MainService extends Service {

	@Override
	public void onCreate() {
		super.onCreate();
		Log.i("DEMO", "Service Created");

		Timer t = new Timer();

		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				Log.i("DEMO", "DEMO Timer");
				String s = null;
				Log.i("DEMO", s.toString());
			}
		};

		t.scheduleAtFixedRate(task, 0, 1000);
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Log.i("DEMO", "onStartCommand");
		return START_STICKY;
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

}
