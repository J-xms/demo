package com.example.tvdemo;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("MyService" , "onStartCommand");
        //实例化IntentFilter对象
        IntentFilter filter = new IntentFilter();
        filter.addAction("remote_control_action");
        DynamicReceiver dynamicReceiver = new DynamicReceiver();
        //注册广播接收
        Log.i("MyService" , "注册广播接收");
        registerReceiver(dynamicReceiver,filter);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

}