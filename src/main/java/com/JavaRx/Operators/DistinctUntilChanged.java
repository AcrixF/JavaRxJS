package com.JavaRx.Operators;

import rx.Observable;

/**
 * Created by root on 23/06/17.
 */
public class DistinctUntilChanged {

    public static void main(String [] args){
        Observable.just(1, 1, 1, 2, 2, 3, 3, 2, 1, 1)
                .distinctUntilChanged()
                .subscribe( i -> System.out.println("Received: " + i));
    }
}
