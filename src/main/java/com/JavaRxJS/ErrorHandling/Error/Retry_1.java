package com.JavaRxJS.ErrorHandling.Error;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by root on 15/06/17.
 */
public class Retry_1 {


    public static void main(String [] args){

        /*
        * Whenever an error occurs, retry() will resubscribe to the source, restarting with the
          emission and encountering the error again and again...
          You can use retry(1) instead of retry() , so the retry mechanism will be executed
          only one time
        *
        * */

        Observable.just("1", "2", "a", "3", "4")
                . map( number -> Integer.parseInt(number))
                .retry(1)
                .subscribe(new Subscriber<Integer>() {
                    @Override
                    public void onCompleted() {
                        System.out.println("sequence completed!");
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        System.err.println("error! " + throwable.toString());
                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println("Next element: " + integer);
                    }
                });

    }

}
