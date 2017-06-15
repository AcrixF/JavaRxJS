package com.JavaRxJS.ErrorHandling.Error;

import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;

import java.util.concurrent.TimeUnit;

/**
 * Created by root on 15/06/17.
 */
public class Retry_3 {


    public static void main(String [] args){

        Observable.just("1", "2", "a", "3", "4")
                .map( number -> Integer.parseInt(number))
                .retryWhen(new Func1<Observable<? extends Throwable>, Observable<?>>() {
                    @Override
                    public Observable<?> call(Observable<? extends Throwable> observable) {
                        return observable.zipWith(Observable.range(1, 3),
                                new Func2<Throwable, Integer, Integer>() {
                                    @Override
                                    public Integer call(Throwable throwable,
                                                        Integer retryCount) {
                                        System.out.println("retry #" + retryCount);
                                        return retryCount;
                                    }
                                }).flatMap(new Func1<Integer, Observable<?>>() {
                            @Override
                            public Observable<?> call(Integer integer) {
                                return Observable.timer(5, TimeUnit.SECONDS);
                            }
                        });
                    }
                }).subscribe(
                number -> System.out.println("Next element: " + number),
                throwable -> System.out.println("Error: " + throwable),
                () -> System.out.println("Sequence Completed")
        );

    }

}
