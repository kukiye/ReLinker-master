package com.getkeepsafe.relinker.sample;

public class Native {

    /*static {
        // 传统jni做法，加载C代码库, 库的名称, 必须是CMakeLists.txt中指定的名称
        System.loadLibrary("hellojni");
    }*/

    public static native String helloJni();
}
