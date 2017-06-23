package com.JavaRx.Operators;


import rx.Observable;

import java.util.concurrent.TimeUnit;

/**
 * Created by root on 23/06/17.
 */
public class Take_2 {

    public static void main(String [] args){
        Observable.interval(500, TimeUnit.MILLISECONDS)
                .take(2, TimeUnit.SECONDS)
                .subscribe( i -> System.out.println("Received: " + i));
        sleep(5000);
    }
    public static void sleep(long millis){
        try{
            Thread.sleep( millis );
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
