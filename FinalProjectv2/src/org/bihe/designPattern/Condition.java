package org.bihe.designPattern;

import org.bihe.designPattern.DataSource.Entity;

public class Condition {

    public String field;
    public String operation;
    public String input;

    public boolean isTrue(Entity entity){
        return entity.check(field,operation,input);
    }
}
