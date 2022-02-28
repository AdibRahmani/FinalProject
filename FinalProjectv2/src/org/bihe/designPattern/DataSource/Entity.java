package org.bihe.designPattern.DataSource;

public abstract class Entity {

    abstract void insert();

    public void delete(){

    }

    abstract void update();

    abstract boolean check(String field , String operand , String input);

}
