package org.example;

import java.util.ArrayList;
import java.util.List;

public class Mementos {

    private List<MovieMemento> mementos;

    public Mementos() {
        mementos = new ArrayList<>();
    }

    public void addMemento(MovieMemento memento) {
        mementos.add(memento);
    }

    public MovieMemento getMemento() {
        MovieMemento memento = mementos.get(mementos.size()-1);
        mementos.remove(mementos.size()-1);
        return memento;

    }



}
