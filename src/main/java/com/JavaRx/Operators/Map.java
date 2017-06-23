package com.JavaRx.Operators;

import rx.Observable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by root on 23/06/17.
 */
public class Map {

    public static void main(String []args){

        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("M/d/yyyy");
        Observable.just("1/3/2016", "5/9/2016", "10/12/2016")
                .map( s -> LocalDate.parse( s, dtf))
                .subscribe(t -> System.out.println(t));
    }
}
