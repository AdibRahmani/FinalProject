package org.bihe.designPattern.Composite;

import org.bihe.designPattern.OperatorEnum;

public class ConditionItem extends ConditionComponent{
    private int constant;
    private String field;
    private OperatorEnum operatorEnum;


    @Override
    public boolean isTure() {
        return false;
    }
}
