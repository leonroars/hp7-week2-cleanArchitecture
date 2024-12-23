package com.hhp7.week2;

import org.springframework.boot.SpringApplication;

public class TestWeek2Application {

    public static void main(String[] args) {
        SpringApplication.from(Week2Application::main).with(TestcontainersConfiguration.class).run(args);
    }

}
