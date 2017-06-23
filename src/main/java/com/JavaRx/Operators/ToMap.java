package com.JavaRx.Operators;

import io.reactivex.Observable;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by root on 23/06/17.
 */
public class ToMap {

    public static void main(String []args){
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .toMap(s -> s.charAt(0))
                .subscribe(s -> System.out.println("Received: " + s));

        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .toMap(s -> s, String::hashCode, ConcurrentHashMap::new)
                .subscribe(s -> System.out.println("Received: " + s));


    }
}
