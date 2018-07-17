package com.example.myplayer;

/**
 * Created by han on 12/7/18.
 */

public class Demo {

    static {
        System.loadLibrary("native-lib");
        System.loadLibrary("ijkffmpeg");
    }



    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}