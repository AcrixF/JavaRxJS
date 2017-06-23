package com.JavaRx.Operators;

import rx.Observable;

/**
 * Created by root on 23/06/17.
 */
public class Filter {
    public static void main(String []args){
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .filter( s -> s.length() != 5)
                .subscribe( s -> System.out.println("Received: " + s));
    }
}
