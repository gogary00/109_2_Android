package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int mCount;
    private TextView textView;
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Add information for saving HelloToast counter
        // to the to the outState bundle
        outState.putInt("count", mCount);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt("count");
            if (textView != null)
                textView.setText(Integer.toString(mCount));
        }
    }

    public void countUp(View view) {
        mCount++;
        if (textView != null)
            textView.setText(Integer.toString(mCount));
    }
}