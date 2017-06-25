package com.JavaRx.Combining;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

import static com.JavaRx.Combining.Merge_3.sleep;

/**
 * Created by neoa on 24/06/17.
 */
public class Merge_3 {

    public static void main(String [] ars){

        Observable<String> source_1 = Observable.interval(1 , TimeUnit.SECONDS)
                .map( l -> l +1)
                .map( l -> "Source_1: " + l + " seconds");

        Observable<String> source_2 = Observable.interval(100, TimeUnit.MILLISECONDS)
                .map( l -> l +1)
                .map( l -> "Source_2: " + l +" milliseconds");

       Observable.merge( source_1, source_2).subscribe(System.out::println);

       sleep(10000);


    }

    public static void sleep(long millis){
        try {
            Thread.sleep( millis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
