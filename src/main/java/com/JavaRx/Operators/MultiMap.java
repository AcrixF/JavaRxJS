package com.JavaRx.Operators;

import io.reactivex.Observable;

/**
 * Created by root on 23/06/17.
 */
public class MultiMap {

    public static void main(String []args){
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .toMultimap(String::length)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
