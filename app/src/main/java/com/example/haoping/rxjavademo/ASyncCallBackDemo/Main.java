package com.example.haoping.rxjavademo.ASyncCallBackDemo;

import android.net.Uri;

/**
 * @Author haoping
 * @Date 2016/12/5
 * @Des TODO
 */

public class Main {

    public static void main(String[] args){
        CatsHelper catsHelper = new CatsHelper();
        catsHelper.saveTheCutestCat("tom", new CallBack<Uri>() {
            @Override
            public void onResult(Uri result) {

            }

            @Override
            public void onError(Exception e) {

            }
        });
    }

}
