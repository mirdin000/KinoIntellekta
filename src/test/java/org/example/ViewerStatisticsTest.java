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

class ViewerStatisticsTest {
    public static ApplicationContext appCon;
    public static List<Viewer> listV;
    public static ConfigurableApplicationContext app;
    @BeforeAll
    static public void BeforeAllTest(){
        app = SpringApplication.run(CinemaApplicationRun.class);
        appCon = new AnnotationConfigApplicationContext(JavaConfig.class);

        Viewer V1 = (Viewer) appCon.getBean("beanViewer","Artem", 26, 50);
        Viewer V2 = (Viewer) appCon.getBean("beanViewer","Mark", 22, 41);
        Viewer V3 = (Viewer) appCon.getBean("beanViewer","Masha", 20, 60);
        Viewer V4 = (Viewer) appCon.getBean("beanViewer","Nikolay", 18, 16);
        Viewer V5 = (Viewer) appCon.getBean("beanViewer","Alex", 26, 15);

        listV = new ArrayList<>();
        listV.add(V1);
        listV.add(V2);
        listV.add(V3);
        listV.add(V4);
        listV.add(V5);
        listV.forEach(V -> System.out.println("Age: " + V.getAge()));
    }

    @Test
    void averageAgeTest() {
        double expected = (26+22+20+18+26)/5;
        assertEquals(expected, ViewerStatistics.averageAge(listV));
    }
    @Test
    void averageAgeUncorrectTest() {
        double expected = (26+22+20+18+10)/5;
        assertNotEquals(expected, ViewerStatistics.averageAge(listV));
    }

    @AfterAll
    static public void AfterAllTest(){
        app.close();
    }
}