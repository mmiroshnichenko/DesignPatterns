package net.mmiroshnichenko.basepatterns.creational.singleton;

public class Application {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        db1.executeQuery("SELECT * FROM users");

        Database db2 = Database.getInstance();
        db2.executeQuery("DELETE FROM users WHERE id = 1");

        Database db3 = Database.getInstance();
        db3.printExecutedQueries();
    }
}
