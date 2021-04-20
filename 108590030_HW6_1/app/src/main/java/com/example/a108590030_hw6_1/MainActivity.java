package com.example.a108590030_hw6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox c1, c2, c3, c4, c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String onSubmit(){
        String submit="";
        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        c4 = (CheckBox) findViewById(R.id.checkBox4);
        c5 = (CheckBox) findViewById(R.id.checkBox5);
        if (c1.isChecked()){
            submit += getResources().getString(R.string.chocolate)+" ";
        }
        if (c2.isChecked()){
            submit += getResources().getString(R.string.sprinkles)+" ";
        }
        if (c3.isChecked()){
            submit += getResources().getString(R.string.crush)+" ";
        }
        if (c4.isChecked()){
            submit += getResources().getString(R.string.cherry)+" ";
        }
        if (c5.isChecked()){
            submit += getResources().getString(R.string.orio);
        }
        return submit;
    }

    public void showToast(View view) {
        String combined = "Toppings: " + onSubmit();
        Toast toast = Toast.makeText(this, combined, Toast.LENGTH_SHORT);
        toast.show();
    }
}