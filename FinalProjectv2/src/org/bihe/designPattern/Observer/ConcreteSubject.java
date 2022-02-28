package org.bihe.designPattern.Observer;

import org.bihe.designPattern.Event;

import java.util.LinkedList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observerList = new LinkedList<>();
    private Event event;

    @Override
    public void registerObserver(Observer observer) {
        observer.setSubject(this);
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observerList) {
            observer.act();
        }
    }

    public void setEvent(Event newEvent) {
        this.event = newEvent;
        notifyObservers();
    }

    public Event getEvent() {
        return event;
    }
}
