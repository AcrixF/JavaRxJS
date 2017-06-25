package com.JavaRx.Combining;

import io.reactivex.Observable;

/**
 * Created by neoa on 24/06/17.
 */
public class FlatMap_2 {

    public static void main(String [] args){

        Observable<String> source = Observable.just("435345/2313/sdsfsf", "234234234/34234/2342342/sdfsf","23324234/wererwe/23123");

        source.flatMap( s -> Observable.fromArray(s.split("/")))
                .filter( s -> s.matches("[0-9]+"))
                .map( Integer::valueOf)
                .subscribe(System.out::println);

    }

}
