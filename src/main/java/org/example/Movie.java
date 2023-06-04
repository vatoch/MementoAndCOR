package org.example;

import java.time.LocalTime;

public class Movie {
    private String name;
    private int duration;
    private int moment;

    public Movie(String name,int duration) {
        this.name = name;
        this.duration = duration;

    }

    public MovieMemento saveMemento(int moment) {
        return new MovieMemento(moment);
    }
    public void restore(MovieMemento memento) {
        this.moment = memento.getMoment();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getMoment() {
        return moment;
    }

    public void setMoment(int moment) {
        this.moment = moment;
    }





}
