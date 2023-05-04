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

        V1 = (Viewer) appCon.getBean("beanViewer","Artem", 26, new ArrayList<Viewer>());
    }

    @Test
    void getCountFilmsTest() {
        int expected = 3;
        Cinema C1 = new Cinema("Avengers", "Fantastic", 2.5);
        Cinema C2 = new Cinema("I,m a robot", "Detective", 2.5);
        Cinema C3 = new Cinema("the last samurai", "drama", 2.5);

        List<Cinema> cinemas = new ArrayList<>();
        cinemas.add(C1);
        cinemas.add(C2);
        cinemas.add(C3);

        V1.setListF(cinemas);
        assertEquals(expected, V1.getCountFilms());
    }

    @Test
    void setListFTest() {
        Cinema C1 = new Cinema("Avengers", "Fantastic", 2.5);
        Cinema C2 = new Cinema("I,m a robot", "Detective", 2.5);
        Cinema C3 = new Cinema("the last samurai", "drama", 2.5);

        List<Cinema> cinemas = new ArrayList<>();
        cinemas.add(C1);
        cinemas.add(C2);
        cinemas.add(C3);

        V1.setListF(cinemas);
        assertEquals(cinemas, V1.getListF());
    }
    @Test
    void getListFTest() {
        Cinema C1 = new Cinema("Avengers", "Fantastic", 2.5);
        Cinema C2 = new Cinema("I,m a robot", "Detective", 2.5);
        Cinema C3 = new Cinema("the last samurai", "drama", 2.5);

        List<Cinema> cinemas = new ArrayList<>();
        cinemas.add(C1);
        cinemas.add(C2);
        cinemas.add(C3);

        V1.setListF(cinemas);
        assertEquals(cinemas, V1.getListF());
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