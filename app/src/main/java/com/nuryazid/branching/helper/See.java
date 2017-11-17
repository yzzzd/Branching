package com.nuryazid.branching.helper;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by yzzzd crocodic on 5/20/15.
 */

public class See {
    public static void log(String message){
        Log.d("branching", message);
    }

    public static void log(String key, String message){
        Log.d("branching", key +" -> "+ message);
    }

    public static void toast(Context context, String message){
        try {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
    }
}
