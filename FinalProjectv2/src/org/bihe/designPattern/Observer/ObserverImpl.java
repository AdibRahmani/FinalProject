package org.bihe.designPattern.Observer;

import org.bihe.designPattern.Rule;

public class ObserverImpl implements Observer {
    private Subject subject;
    private Rule rule;

    public ObserverImpl(Rule rule) {
        this.rule = rule;
    }

    @Override
    public void act(Event event) {
        // for on rules list
        // find match event in rules list
        // if we have same event then we check the conditions
        // if conditions true then do the actions
    }

    @Override
    public void setSubject(Subject subject) {

    }
}
