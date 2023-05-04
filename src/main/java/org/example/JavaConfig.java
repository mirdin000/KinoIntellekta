package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class JavaConfig {
    @Bean
    @Scope("prototype")
    @Qualifier("beanViewer")
    public Viewer beanViewer(String nickname, int age, List<Cinema> listF){
        return new Viewer(nickname, age, listF);
    }
    @Bean
    @Scope("prototype")
    @Qualifier("beanCinema")
    public Cinema beanCinema(String name, String genre, double duration){
        return new Cinema(name, genre, duration);
    }
}
