package com.example.alexr.brightwave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button daily = (Button) findViewById(R.id.daily);
        Button weekly = (Button)findViewById(R.id.weekly);

        daily.setOnClickListener((v));
    }
}
