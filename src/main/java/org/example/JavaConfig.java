package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {
    @Bean
    @Scope("prototype")
    @Qualifier("beanViewer")
    public Viewer beanViewer(String nickname, int age, int countFilms){
        return new Viewer(nickname, age, countFilms);
    }
}
