package com.JavaRx.Operators;

import rx.Observable;

/**
 * Created by root on 23/06/17.
 */
public class Distinct {

    public static void main(String [] args){
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .map( String::length)
                .distinct()
                .subscribe(i -> System.out.println("Received: " + i));
    }
}
