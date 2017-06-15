package com.JavaRxJS.Subjects.Subjects;

import rx.subjects.PublishSubject;
import rx.subjects.Subject;

/**
 * Created by root on 15/06/17.
 */
public class Subjects_1 {

    public static void main(String [] args){

        Subject<String, String> subject = PublishSubject.create();

        subject.subscribe(
                ( element ) -> System.out.println( "Next Element: " + element ),
                ( throwable ) -> System.out.println("Error: " + throwable),
                () -> System.out.println("Sequence Completaded")
        );

        subject.onNext("First Item");
        subject.onNext("Second Item");
        subject.onNext("Thrid Item");
        subject.onCompleted();
    }

}
