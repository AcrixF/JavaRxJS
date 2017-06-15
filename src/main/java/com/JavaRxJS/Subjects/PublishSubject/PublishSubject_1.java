package com.JavaRxJS.Subjects.PublishSubject;

import rx.Observable;
import rx.subjects.PublishSubject;

/**
 * Created by root on 15/06/17.
 */
public class PublishSubject_1 {

    /*
      PublishSubject<T> is a Subject that Emits all the items emitted by the source observable, starting
      from the moment of the subscription. Notifies of an error event and does not emit any other item if the source Observable terminates with an error
    */

    public static void main(String [] args){

        PublishSubject<Integer> subject = PublishSubject.create();

        Observable<Integer> subjectAsObservable = subject.asObservable();

        subjectAsObservable.subscribe(
                element -> System.out.println("First Subscriber  Element: " + element ),
                err -> System.out.println("Error: " + err ),
                () -> System.out.println("First Completed")
        );

        subject.onNext( 1 );
        subject.onNext( 2 );

        subjectAsObservable.subscribe(
                element -> System.out.println("Second Subscriber Element: " + element ),
                err -> System.out.println("Error: " + err ),
                () -> System.out.println("Second Completed")
        );

        subject.onNext( 3 );
        subject.onNext( 4 );
        subject.onNext( 5 );
        subject.onCompleted();

    }
}
