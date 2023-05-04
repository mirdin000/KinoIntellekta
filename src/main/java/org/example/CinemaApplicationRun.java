package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class CinemaApplicationRun{
    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext app = SpringApplication.run(CinemaApplicationRun.class, args);
        ApplicationContext appCon = new AnnotationConfigApplicationContext(JavaConfig.class);

        Cinema C1 = (Cinema) appCon.getBean("beanCinema", "the last samurai", "drama", 2.5);
        Cinema C2 = (Cinema) appCon.getBean("beanCinema", "I,m a robot", "Detective", 2.5);
        Cinema C3 = (Cinema) appCon.getBean("beanCinema", "the last samurai", "drama", 2.5);
        Cinema C4 = (Cinema) appCon.getBean("beanCinema", "Avengers", "Fantastic", 2.5);
        Cinema C5 = (Cinema) appCon.getBean("beanCinema", "I,m a robot", "Detective", 2.5);

        List<Cinema> cinemas = new ArrayList<>();
        cinemas.add(C1);
        cinemas.add(C2);
        cinemas.add(C3);
        cinemas.add(C4);
        cinemas.add(C5);

        Viewer V1 = (Viewer) appCon.getBean("beanViewer","Artem", 26, cinemas);
        Viewer V2 = (Viewer) appCon.getBean("beanViewer","Mark", 22, cinemas);
        Viewer V3 = (Viewer) appCon.getBean("beanViewer","Masha", 20, cinemas);
        Viewer V4 = (Viewer) appCon.getBean("beanViewer","Nikolay", 18, cinemas);
        Viewer V5 = (Viewer) appCon.getBean("beanViewer","Alex", 26, cinemas);

        List<Viewer> listV = new ArrayList<>();
        listV.add(V1);
        listV.add(V2);
        listV.add(V3);
        listV.add(V4);
        listV.add(V5);

        app.close();
    }
}
