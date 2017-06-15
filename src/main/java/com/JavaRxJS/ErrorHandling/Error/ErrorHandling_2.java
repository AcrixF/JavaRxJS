package com.JavaRxJS.ErrorHandling.Error;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/**
 * Created by root on 15/06/17.
 */
public class ErrorHandling_2 {
    public static void main(String []args){
        Observable.just("1", "2", "a", "3", "4").map(new Func1<String, Integer>() {
            public Integer call(String s){
                return Integer.parseInt(s);
            }
        }).onErrorReturn(new Func1<Throwable, Integer>() {
            public Integer call(Throwable throwable) {
                return -1;
            }
        }).subscribe(new Subscriber<Integer>() {
            public void onCompleted() {
                System.out.println("sequence completed!");
            }

            public void onError(Throwable throwable) {
                System.err.println("error! " + throwable.toString());
            }

            public void onNext(Integer integer) {
                System.out.println("next item is: " + integer);
            }
        });
    }

}
