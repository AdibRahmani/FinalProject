package org.bihe.designPattern.Command;

import org.bihe.designPattern.DataSource.Entity;

public class SendEmailCommand implements Command{

    @Override
    public void execute(Entity obj) {
        System.out.println("email was send to");
    }
}
