package org.example;

import java.util.Random;

public abstract class Player implements Handler{

    private Movie movie;
    private Handler handler;


    public Player(Movie movie) {
        this.movie = movie;


    }

    public boolean check() {
        Random random = new Random();
        int rand = random.nextInt(2);
        return rand==1;

    }

    @Override
    public void handle() {

        if(!check()) {
            if(getHandler()==null) {
                System.out.println("sorry couldn't play movie");
                return;
            }
            getHandler().handle();
            return;
        }
        for(int i = 0;i< getMovie().getDuration();i++) {
            getMovie().setMoment(i);
        }
    }


    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
