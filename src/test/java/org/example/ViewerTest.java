package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ViewerTest {
    public static ApplicationContext appCon;
    public static ConfigurableApplicationContext app;
    public static Viewer V1;
    @BeforeAll
    static public void BeforeAllTest(){
        app = SpringApplication.run(CinemaApplicationRun.class);
        appCon = new AnnotationConfigApplicationContext(JavaConfig.class);

        V1 = (Viewer) appCon.getBean("beanViewer","Artem", 26, 50);
    }

    @Test
    void getCountFilmsTest() {
        int expected = 10;
        V1.setCountFilms(expected);
        assertEquals(expected, V1.getCountFilms());
    }

    @Test
    void setCountFilmsTest() {
        int expected = 10;
        V1.setCountFilms(expected);
        assertEquals(expected, V1.getCountFilms());
    }

    @Test
    void getAgeTest() {
        int expected = 10;
        V1.setAge(expected);
        assertEquals(expected, V1.getAge());
    }

    @Test
    void setAgeTest() {
        int expected = 10;
        V1.setAge(expected);
        assertEquals(expected, V1.getAge());
    }

    @Test
    void getNicknameTest() {
        String expected = "Bob";
        V1.setNickname(expected);
        assertEquals(expected, V1.getNickname());
    }

    @Test
    void setNicknameTest() {
        String expected = "Bob";
        V1.setNickname(expected);
        assertEquals(expected, V1.getNickname());
    }

    @AfterAll
    static public void AfterAllTest(){
        app.close();
    }
}