package com.JavaRx.Operators;

import io.reactivex.Observable;

/**
 * Created by root on 23/06/17.
 */
public class Error {
    public static void main(String []args){

        System.out.println("\n******************Throwing The error*************************\n");
        Observable.just(5, 2, 4, 0, 3, 2, 8)
                .map(i -> 10 / i)
                .subscribe( i -> System.out.println("Received: " + i ), error -> System.err.println("Received error: " + error));

        System.out.println("\n******************Setting a default value when a error is throwed *************************\n");

        Observable.just(5, 2, 4, 0, 3, 2, 8)
                .map( i -> 10/i)
                .onErrorReturnItem(-1)
                .subscribe(i -> System.out.println("RECEIVED: " + i), e -> System.out.println("RECEIVED ERROR: " + e));

        System.out.println("\n******************Another Way Suppliying a value for the error *************************\n");

        Observable.just(5, 2, 4, 0, 3, 2, 8)
                .map( i -> 10/i)
                .onErrorReturn( e -> -1)
                .subscribe(i -> System.out.println("RECEIVED: " + i), e -> System.out.println("RECEIVED ERROR: " + e));

        System.out.println("\n******************Everithing will end fine*************************\n");
        Observable.just(5, 2, 4, 0, 3, 2, 8)
                .map( i ->{
                    try{
                        return 10/i;
                    }catch (Exception e){
                        return -1;
                    }
                }).subscribe(i -> System.out.println("RECEIVED: " + i), e -> System.out.println("RECEIVED ERROR: " + e));

    }
}
