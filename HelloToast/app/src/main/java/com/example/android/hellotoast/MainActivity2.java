package com.example.android.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView showCount;
    private int mCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        showCount=(TextView) findViewById(R.id.showCount);
        Bundle bundle = getIntent().getExtras();
        mCount = bundle.getInt("count" );

        showCount.setText(Integer.toString(mCount));
    }
}