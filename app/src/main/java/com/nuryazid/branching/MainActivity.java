package com.nuryazid.branching;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nuryazid.branching.helper.See;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        See.log("pop logcat");
    }
}
