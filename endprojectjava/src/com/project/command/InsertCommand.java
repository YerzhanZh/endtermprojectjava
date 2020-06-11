package com.project.command;

public class InsertCommand implements Command {
    Menu database;

    public InsertCommand(Menu database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();

    }
}
