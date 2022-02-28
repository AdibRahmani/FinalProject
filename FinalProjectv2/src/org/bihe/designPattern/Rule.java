package org.bihe.designPattern;

import java.util.List;

public class Rule {
    private Event event;
    private Condition conditions;
    private List<Action> actions;

    public Rule(Event event, Condition conditions, List<Action> actions) {
        this.event = event;
        this.conditions = conditions;
        this.actions = actions;
    }

    public Event getEvent() {
        return event;
    }

    public Condition getConditions() {
        return conditions;
    }

    public List<Action> getActions() {
        return actions;
    }
}
