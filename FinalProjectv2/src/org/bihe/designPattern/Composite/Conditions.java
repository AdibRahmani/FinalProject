package org.bihe.designPattern.Composite;

import java.util.List;

public class Conditions extends ConditionComponent{
    List<ConditionComponent> conditions;
    String logical;

    @Override
    public boolean isTure() {
        return false;
    }

//    boolean temp(){
//        boolean isFalse=false;
//
//
//    }
}
