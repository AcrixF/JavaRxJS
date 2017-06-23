package com.JavaRx.Operators;

import rx.Observable;

/**
 * Created by root on 23/06/17.
 */
public class DefaultIfEmpty {
    public static void main(String []args){
        Observable<String> items = Observable.just("Alpha","Beta","Gamma","Delta","Epsilon");

        items.filter( s -> s.startsWith("Z"))
                .defaultIfEmpty("None")
                .subscribe(s -> System.out.println(s));
    }
}
