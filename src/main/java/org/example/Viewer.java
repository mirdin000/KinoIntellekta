package org.example;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.Min;
import java.util.List;

public class Viewer {
    @NotNull
    private String nickname;
    @Min(0)
    private int age;
    @Min(0)
    private int countFilms;
    private List<Cinema> listF;

    public Viewer(@NotNull String nickname, @Min(0) int age, List<Cinema> listF) {
        this.nickname = nickname;
        this.age = age;
        this.listF = listF;
        this.countFilms = listF.size();
    }

    public List<Cinema> getListF() {
        return listF;
    }

    public void setListF(List<Cinema> listF) {
        this.listF = listF;
        this.countFilms = listF.size();
    }

    public @Min(0) int getAge() {
        return age;
    }

    public void setAge(@Min(0) int age) {
        this.age = age;
    }

    public @NotNull String getNickname() {
        return nickname;
    }

    public void setNickname(@NotNull String nickname) {
        this.nickname = nickname;
    }

    public @Min(0) int getCountFilms() {
        return countFilms;
    }
}
