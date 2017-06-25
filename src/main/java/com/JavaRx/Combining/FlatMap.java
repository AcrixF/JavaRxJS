package com.JavaRx.Combining;

import io.reactivex.Observable;

/**
 * Created by neoa on 24/06/17.
 */
public class FlatMap {

    public static void main(String [] args){

        Observable<String> source = Observable.just("Alpha","Beta","Gamma","Delta","Epsilon");

        source.flatMap( s -> Observable.fromArray( s.split(""))).subscribe( System.out::println);
    }

}
