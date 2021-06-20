package com.example.myaidlapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyAidlService extends Service {
    public MyAidlService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
//        throw new UnsupportedOperationException("Not yet implemented");
        return ibinder;
    }

    private IMyAidlInterface.Stub ibinder = new IMyAidlInterface.Stub() {
        @Override
        public String getMessage() throws RemoteException {
            return "Hi, I am MyAidlService!";
        }

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }
    };
}