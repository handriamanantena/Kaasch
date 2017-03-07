package com.example.mrides;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mrides.Domain.Notification;

import java.util.ArrayList;
import java.util.HashMap;

public class NotificationActivity extends AppCompatActivity {

    private Typeface typeFace1;
    private TextView textViewTitle;
//    private HashMap <String, String> notifications = new HashMap<>();
//    notifications.put("John", "invitation");
//    notifications.put("Jane", "confirmation");
//    notifications.put("Gray", "invitation");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        textViewTitle = (TextView) findViewById(R.id.notificationTitle);
        typeFace1 = Typeface.createFromAsset(getAssets(), "Ubuntu-L.ttf");
        textViewTitle.setTypeface(typeFace1);

        ArrayList<String> notifications = new ArrayList<>();
        notifications.add("John invited you to be a part of their route");
        notifications.add("Jane invited you to be a part of their route");
        notifications.add("Carl confirmed your invitation");
        notifications.add("Carly left your route");

        ListView notificationView  = (ListView) findViewById(R.id.notificationList);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, notifications);

        notificationView.setAdapter(arrayAdapter);





    }

}
