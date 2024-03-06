package com.salihcanhiz.cohortshomework2;

import com.salihcanhiz.cohortshomework2.dummydata.AppMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CohortsHomework2Application {

    public static void main(String[] args) {
        SpringApplication.run(CohortsHomework2Application.class, args);

		AppMenu.appRun();
    }


}
