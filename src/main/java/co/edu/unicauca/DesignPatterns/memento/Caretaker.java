package co.edu.unicauca.DesignPatterns.memento;

import co.edu.unicauca.DesignPatterns.entities.Project;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private final List<Project.Memento> savedStates = new ArrayList<>();
    public void addMemento(Project.Memento memento) {
        savedStates.add(memento);
    }
    public Project.Memento getMemento(int index) {
        return savedStates.get(index);
    }
}

