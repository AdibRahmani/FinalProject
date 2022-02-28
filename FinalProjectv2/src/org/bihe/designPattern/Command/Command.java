package org.bihe.designPattern.Command;

import org.bihe.designPattern.DataSource.Entity;

public interface Command {
    void execute(Entity data);
}
