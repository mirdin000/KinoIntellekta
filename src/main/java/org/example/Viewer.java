package org.example;

import org.jetbrains.annotations.NotNull;
import javax.validation.constraints.Min;

public class Viewer {
    @NotNull
    private String nickname;
    @Min(0)
    private int age;
    @Min(0)
    private int countFilms;

    public Viewer(@NotNull String nickname, @Min(0) int age, @Min(0) int countFilms) {
        this.nickname = nickname;
        this.age = age;
        this.countFilms = countFilms;
    }

    public @Min(0) int getCountFilms() {
        return countFilms;
    }

    public void setCountFilms(@Min(0) int countFilms) {
        this.countFilms = countFilms;
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
}
