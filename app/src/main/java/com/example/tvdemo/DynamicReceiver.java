package com.example.tvdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class DynamicReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("DynamicReceiver", "onReceive");
        // 动态广播
        String opt = intent.getStringExtra("opt_key");
        switch (opt) {
            case "111":
                Log.i("DynamicReceiver", "执行 111指令");
                break;
            case "222":
                Log.i("DynamicReceiver", "执行 222指令");
                break;
            case "333":
                Log.i("DynamicReceiver", "执行 333指令");
                break;
            default:
                Log.i("DynamicReceiver", "错误指令指令");
                break;
        }
    }
}
