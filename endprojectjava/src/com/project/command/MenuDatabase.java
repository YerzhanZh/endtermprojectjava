package com.project.command;

public class MenuDatabase {
    public static void main(String[] args){
        Menu database = new Menu("Hot","americano",550);
        Menu database11 = new Menu("Hot","americano", 600);
        Menu database1 = new Menu("Hot","latte", 890);

        Manager manager = new Manager(
                new InsertCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database)
        );

        Manager manager11 = new Manager(
                new InsertCommand(database11),
                new UpdateCommand(database11),
                new DeleteCommand(database11)
        );

        Manager manager1 = new Manager(
                new InsertCommand(database1),
                new UpdateCommand(database1),
                new DeleteCommand(database1)
        );

        database.type();
        manager.insertMenu();
        database1.type();
        manager1.insertMenu();
        manager11.updateMenu();
    }
}
