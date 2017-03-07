package com.example.mrides;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mrides.Domain.Notification;

public class NotificationActivity extends AppCompatActivity {

    private Typeface typeFace1;
    private TextView textViewTitle;
    private Notification notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        textViewTitle = (TextView) findViewById(R.id.notificationTitle);
        typeFace1 = Typeface.createFromAsset(getAssets(), "Ubuntu-L.ttf");
        textViewTitle.setTypeface(typeFace1);

    }
}
