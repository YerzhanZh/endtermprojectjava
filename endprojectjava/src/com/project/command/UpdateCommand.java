package com.project.command;

public class UpdateCommand implements Command {
    Menu database;

    public UpdateCommand(Menu database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
