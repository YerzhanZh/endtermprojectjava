package com.project.command;

public class Manager {
    Command insert;
    Command update;
    Command delete;

    public Manager(Command insert, Command update,  Command delete) {
        this.insert = insert;
        this.update = update;
        this.delete = delete;
    }

    public void insertMenu(){
        insert.execute();
    }

    public void updateMenu(){
        update.execute();
    }

    public void deleteMenu(){
        delete.execute();
    }

}
