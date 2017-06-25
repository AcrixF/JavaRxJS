package com.JavaRx.Combining;

import io.reactivex.Observable;

/**
 * Created by neoa on 24/06/17.
 */
public class Merge {

    public static void main(String [] arg){

        Observable<String> source_1 = Observable.just("Alpha","Beta","Gamma","Delta","Epsilon");
        Observable<String> source_2 = Observable.just("Zeta","Eta","Theta");

        Observable.merge( source_1, source_2).subscribe( i -> System.out.print( " Received: " + i ));

        System.out.println();

        source_1.mergeWith( source_2 ).subscribe( i -> System.out.print( " Received: " + i));


    }

}
