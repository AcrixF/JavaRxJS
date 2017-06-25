package com.JavaRx.Combining;

import io.reactivex.Observable;

/**
 * Created by neoa on 24/06/17.
 */
public class Concat {

    public static void main(String [] args){

        Observable<String> source_1 = Observable.just("Alpha","Beta");
        Observable<String> source_2 = Observable.just("Gamma","Delta","Epsilon");

        Observable.concat( source_1, source_2).subscribe( i -> System.out.println("Received: " + i));

    }
}
