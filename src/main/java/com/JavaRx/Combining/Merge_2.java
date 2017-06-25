package com.JavaRx.Combining;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * Created by neoa on 24/06/17.
 */
public class Merge_2 {

    public static void main(String [] args){

        Observable<String> source_1 = Observable.just("Alpha","Betha");
        Observable<String> source_2 = Observable.just("Gamma","Delta");
        Observable<String> source_3 = Observable.just("Epsilon","Zeta");
        Observable<String> source_4 = Observable.just("Eta", "Theta");
        Observable<String> source_5 = Observable.just("Iota","Kappa");

        List<Observable<String>> sources = Arrays.asList( source_1, source_2, source_3, source_4, source_5);

        Observable.merge( sources ).subscribe( i -> System.out.println("Received: " + i ));
    }

}
