package com.JavaRx.Combining;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * Created by neoa on 24/06/17.
 */
public class FlatMap_3 {

    public static void main(String [] args){

        Observable<Integer> intervalArgument = Observable.just(2,3,10,7);

        intervalArgument.flatMap( i ->{
                return Observable.interval( i , TimeUnit.SECONDS).map( i2 -> i +"s interval: " + ( (i +1 ) * 1) +  " seconds elapsed");
        }
        ).subscribe( System.out::println);


        sleep(12000);
    }

    public static void sleep( long millis){
        try{
            Thread.sleep( millis );
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}