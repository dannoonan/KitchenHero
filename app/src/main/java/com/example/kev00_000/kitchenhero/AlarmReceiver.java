package com.example.kev00_000.kitchenhero;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {

            String name = intent.getStringExtra("data");
            Intent service_intent=new Intent(context, RingtonePlayingService.class);
            intent.putExtra("data",name);
            context.startService(service_intent);
            NotificationManager notifications = (NotificationManager)
                    context.getSystemService(Context.NOTIFICATION_SERVICE);
        }

    }