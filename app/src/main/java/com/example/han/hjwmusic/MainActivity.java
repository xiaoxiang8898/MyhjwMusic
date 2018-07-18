package com.example.han.hjwmusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myplayer.Demo;

public class MainActivity extends AppCompatActivity {

    private Demo mydemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mydemo = new Demo();

        mydemo.TestFunc();

        //Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(mydemo.stringFromJNI());
    }


}
