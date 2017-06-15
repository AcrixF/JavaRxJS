package com.JavaRxJS.Subjects.Subjects;

import rx.Observable;
import rx.Observable.*;
import rx.subjects.PublishSubject;
import rx.subjects.Subject;

import java.util.concurrent.TimeUnit;

/**
 * Created by root on 15/06/17.
 */
public class Subject_2 {

    public static void main(String [] args){

        Observable<Long> interval = Observable.interval(1 , TimeUnit.SECONDS);

        Subject<Long, Long> subject = PublishSubject.create();

        interval.subscribe( subject );

        subject.subscribe(
                ( element ) -> System.out.println("Next Element: "  + element),
                ( throwable) -> System.out.println("Error: " + throwable),
                () -> System.out.println( "First Sequence Completed")
        );

        subject.subscribe(
                ( element ) -> System.out.println("Next Element: "  + element),
                ( throwable) -> System.out.println("Error: " + throwable),
                () -> System.out.println( "Second  Sequence Completed")
        );

    }

}
