package com.JavaRx.Operators;

import rx.Observable;

/**
 * Created by root on 23/06/17.
 */
public class Skip {
    public static void main(String []args){
        Observable.range(1, 100)
                .skip(90)
                .subscribe(i -> System.out.println("Received: " + i));
    }
}
