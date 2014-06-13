package com.udgama.demo;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Receiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.i("DEMO", "Broadcast Received");
        Intent intent1 = new Intent(context, MainService.class);
        context.startService(intent1);	
	}

}
