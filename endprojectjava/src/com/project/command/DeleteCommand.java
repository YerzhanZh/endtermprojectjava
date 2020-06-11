package com.project.command;

public class DeleteCommand implements Command {
    Menu database;

    public DeleteCommand(Menu database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
