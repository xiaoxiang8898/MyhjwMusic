package com.example.myplayer;

import android.util.Log;

/**
 * Created by han on 12/7/18.
 */

public class Demo {

    static {
        System.loadLibrary("native-lib");
        System.loadLibrary("ijkffmpeg");
        //System.loadLibrary("avcodec-57");
        //System.loadLibrary("avdevice-57");
        //System.loadLibrary("avfilter-6");
        //System.loadLibrary("avformat-57");
        //System.loadLibrary("avutil-55");
        //System.loadLibrary("postproc-54");
        //System.loadLibrary("swresample-2");
        //System.loadLibrary("swscale-4");
    }



    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    public void TestFunc(){
        Log.e("HANJINWEI","Change run");
    }
}