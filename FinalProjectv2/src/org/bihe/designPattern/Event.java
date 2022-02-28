package org.bihe.designPattern;

public class Event {
    private String object;
    private String eventType;
    // Entity


    public Event(String objectType, String eventType) {
        this.eventType = eventType;
        this.objectType = objectType;
    }
}
