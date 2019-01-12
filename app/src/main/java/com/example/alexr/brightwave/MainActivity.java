package com.example.alexr.brightwave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView daily = (TextView)findViewById(R.id.daily);
        TextView weekly = (TextView)findViewById(R.id.weekly);
    }
}
