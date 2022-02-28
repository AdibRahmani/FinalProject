package org.bihe.designPattern.Observer;

import org.bihe.designPattern.Event;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    Event getEvent();
}
