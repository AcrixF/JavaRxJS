package com.JavaRx.Operators;

import io.reactivex.Observable;

import java.util.Comparator;

/**
 * Created by root on 23/06/17.
 */
public class Sorted {
    public static void main(String []args){
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                .sorted()
                .subscribe(System.out::println);

        System.out.println("*********************************");

        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                .sorted(Comparator.reverseOrder())
                .subscribe(System.out::println);
    }
}
