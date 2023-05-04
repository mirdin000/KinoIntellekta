package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CinemaTest {
    public static ApplicationContext appCon;
    public static ConfigurableApplicationContext app;
    public static Cinema C1;
    @BeforeAll
    static public void BeforeAllTest(){
        app = SpringApplication.run(CinemaApplicationRun.class);
        appCon = new AnnotationConfigApplicationContext(JavaConfig.class);
        C1 = (Cinema) appCon.getBean("beanCinema", "the last samurai", "drama", 2.5);
    }

    @Test
    void getNameTest() {
        String expected = "I'm a robot";
        C1.setName(expected);
        assertEquals(expected, C1.getName());
    }

    @Test
    void setNameTest() {
        String expected = "I'm a robot";
        C1.setName(expected);
        assertEquals(expected, C1.getName());
    }

    @Test
    void getGenreTest() {
        String expected = "Detective";
        C1.setGenre(expected);
        assertEquals(expected, C1.getGenre());
    }

    @Test
    void setGenreTest() {
        String expected = "Detective";
        C1.setGenre(expected);
        assertEquals(expected, C1.getGenre());
    }

    @Test
    void getDurationTest() {
        double expected = 2.8;
        C1.setDuration(expected);
        assertEquals(expected, C1.getDuration());
    }

    @Test
    void setDurationTest() {
        double expected = 2.8;
        C1.setDuration(expected);
        assertEquals(expected, C1.getDuration());
    }

    @AfterAll
    static public void AfterAllTest(){
        app.close();
    }
}