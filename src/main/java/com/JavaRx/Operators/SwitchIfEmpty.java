package com.JavaRx.Operators;


import io.reactivex.Observable;

/**
 * Created by root on 23/06/17.
 */
public class SwitchIfEmpty {

    public static void main(String []args){
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .filter(s -> s.startsWith("Z"))
                .switchIfEmpty(Observable.just("Zeta", "Eta", "Theta"))
                .subscribe( i -> System.out.println("Received: " + i), e -> System.out.println("Received error: " + e));
    }
}
