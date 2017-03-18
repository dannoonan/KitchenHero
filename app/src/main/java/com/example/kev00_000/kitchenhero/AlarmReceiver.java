package com.example.kev00_000.kitchenhero;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v7.app.NotificationCompat;

public class AlarmReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {

            Uri soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            String name = intent.getStringExtra("data");

            android.support.v4.app.NotificationCompat.Builder mBuilder =
                    new NotificationCompat.Builder(context)
                            .setSmallIcon(R.drawable.ic_launcher)
                            .setContentTitle("KitchenHero")
                            .setContentText("Time put your "+name+" on!!")
                            .setSound(soundUri)
                            .setAutoCancel(true);


            NotificationManager notifications = (NotificationManager)
                    context.getSystemService(Context.NOTIFICATION_SERVICE);
            notifications.notify(1, mBuilder.build());
        }

    }