package org.example;

public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie("Legends Of Fall",256);

        Player handler = new Player1(movie);

        Player handler1 = new Player2(movie);
        handler.setHandler(handler1);
        handler.handle();




    }
}