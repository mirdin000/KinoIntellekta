package org.example;

import org.jetbrains.annotations.NotNull;
import javax.validation.constraints.Min;

public class Cinema {
    @NotNull
    private String name;
    @NotNull
    private String genre;
    @Min(0)
    private double duration;

    public Cinema(@NotNull String name, @NotNull String genre, double duration) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }

    public @NotNull String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public @NotNull String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public @Min(0) double getDuration() {
        return duration;
    }

    public void setDuration(@Min(0) double duration) {
        this.duration = duration;
    }
}
