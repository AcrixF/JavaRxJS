package com.JavaRx.Operators;

import io.reactivex.Observable;

import java.util.HashSet;

/**
 * Created by root on 23/06/17.
 */
public class Collect {
    public static void main(String []arg){
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .collect(HashSet::new, HashSet::add)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
