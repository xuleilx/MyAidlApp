// IMyAidlInterface.aidl
package com.example.myaidlapp;

// Declare any non-default types here with import statements

interface IMyAidlInterface {
    String getMessage();
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);
}