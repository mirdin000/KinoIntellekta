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

        Viewer V1 = (Viewer) appCon.getBean("beanViewer","Artem", 26, 50);
        Viewer V2 = (Viewer) appCon.getBean("beanViewer","Mark", 22, 41);
        Viewer V3 = (Viewer) appCon.getBean("beanViewer","Masha", 20, 60);
        Viewer V4 = (Viewer) appCon.getBean("beanViewer","Nikolay", 18, 16);
        Viewer V5 = (Viewer) appCon.getBean("beanViewer","Alex", 26, 15);

        List<Viewer> listV = new ArrayList<>();
        listV.add(V1);
        listV.add(V2);
        listV.add(V3);
        listV.add(V4);
        listV.add(V5);

        app.close();
    }
}
