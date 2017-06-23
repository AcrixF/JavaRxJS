package com.JavaRx.Operators;

import io.reactivex.Observable;

/**
 * Created by root on 23/06/17.
 */
public class Reduce {

    public static void main(String []args){
        Observable.just(5, 3, 7, 10, 2, 14)
                .reduce( (total, next) -> total + next)
                .subscribe(s -> System.out.println("Received: " + s));

        Observable.just(5, 3, 7, 10, 2, 14)
                .reduce("", (total, next) -> total + (total.equals("")? "" :",") + next)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
