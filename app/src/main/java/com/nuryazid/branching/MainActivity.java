package com.nuryazid.branching;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.nuryazid.branching.helper.See;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        See.log("pop logcat");
        Log.e("tag","versi 1.2");

        See.toast(this,"halo");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    /**
     *
     * @param message
     */
    private void logMessage(String message) {
        See.log(message);
    }
}
