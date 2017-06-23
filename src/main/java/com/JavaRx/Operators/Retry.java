package com.JavaRx.Operators;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * Created by root on 23/06/17.
 */
public class Retry {
    public static void main(String [] args){
        /* It tries until achive successfully
        Observable.just(5, 2, 4, 0, 3, 2, 8)
                .map(i -> 10 / i)
                .retry()
                .subscribe(i -> System.out.println("RECEIVED: " + i), e -> System.out.println("RECEIVED ERROR: " + e));
        */
        //Ontry tries twice or the times that you supply
        Observable.just(5, 2, 4, 0, 3, 2, 8)
                .map(i -> 10 / i)
                .retry(2)
                .subscribe(i -> System.out.println("RECEIVED: " + i), e -> System.out.println("RECEIVED ERROR: " + e));

    }
}
