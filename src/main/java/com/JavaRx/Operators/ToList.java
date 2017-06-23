package com.JavaRx.Operators;

import io.reactivex.Observable;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by root on 23/06/17.
 */
public class ToList {

    public static void main(String []args){
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .toList()
                .subscribe(s -> System.out.println("Received: " + s));

        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .toList(CopyOnWriteArrayList::new)
                .subscribe( s -> System.out.println("Received: " + s));

        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .toSortedList()
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
