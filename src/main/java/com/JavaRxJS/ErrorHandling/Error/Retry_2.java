package com.JavaRxJS.ErrorHandling.Error;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;

import javax.sound.midi.Soundbank;
import java.util.concurrent.TimeUnit;

/**
 * Created by root on 15/06/17.
 */
public class Retry_2 {

    public static void main(String [] args){

        Action1<String> onCompleted = ( message ) -> System.out.println( message );

        Action1<Throwable> onError = ( throwable ) -> System.out.println( "Error: " + throwable);

        Action1<?> OnNext =  ( number ) -> System.out.println("Next item: " + number);

        Observable.just("1", "2", "a", "3", "4")
                .map( number -> Integer.parseInt(number))
                .retryWhen(new Func1<Observable<? extends Throwable>, Observable<?>>() {
                    @Override
                    public Observable<?> call(Observable<? extends Throwable> observable) {
                        return Observable.timer(5, TimeUnit.SECONDS);
                    }
                }).subscribe(
                        number  -> System.out.println("Next Element: "+ number),
                        throwable -> System.out.println("Error: " + throwable),
                        () -> System.out.println("Sequence Completed!")
        );

    }
}
