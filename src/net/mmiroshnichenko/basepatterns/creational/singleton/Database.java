package net.mmiroshnichenko.basepatterns.creational.singleton;

public class Database {
    private static Database database;
    private static String executedQueries = "";

    public static synchronized Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    private Database() {

    }

    public void executeQuery(String query) {
        executedQueries += query + "\n";
    }

    public void printExecutedQueries() {
        System.out.println(executedQueries);
    }
}
