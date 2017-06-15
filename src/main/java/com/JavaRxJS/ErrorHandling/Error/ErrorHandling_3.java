package com.JavaRxJS.ErrorHandling.Error;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/**
 * Created by Neoa on 15/06/17.
 */
public class ErrorHandling_3 {


    public static void main(String [] args){

        Observable.just("1", "2", "a", "3", "4").map( s -> Integer.parseInt(s))
                .onErrorResumeNext( Observable.just( -1 ))
                .subscribe(new Subscriber<Integer>() {
                    @Override
                    public void onCompleted() {
                        System.out.println("secuence completed");
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        System.out.println("Error!: " + throwable);
                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println("Next item is: " + integer);
                    }
                });

    }

}
