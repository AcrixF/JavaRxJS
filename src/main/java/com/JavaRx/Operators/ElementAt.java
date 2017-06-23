package com.JavaRx.Operators;

import rx.Observable;

/**
 * Created by root on 23/06/17.
 */
public class ElementAt {

    /*
       You can get a specific emission by its index specified by a Long, starting at 0 . After that item is found
       and emitted, onComplete() will be called and the subscription will be disposed of.
    */
    public static void main(String [] args){
        Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma", "Delta")
                .elementAt(3)
                .subscribe( i -> System.out.println("Received: " + i));
    }
}
