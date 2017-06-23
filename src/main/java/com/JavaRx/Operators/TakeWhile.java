package com.JavaRx.Operators;

import rx.Observable;

/**
 * Created by root on 23/06/17.
 */
public class TakeWhile {
    public static void main(String []args){
        Observable.range(1, 100)
                .takeWhile( i -> i < 15)
                .subscribe( s -> System.out.println("Received: " + s));
    }


}
