package net.mmiroshnichenko.basepatterns.structural.decorator;

public class Application {
    public static void main(String[] args) {
        DataSource dataSource = new EncryptionDecorator(new FileDataSource());

        dataSource.writeData("Test");
    }
}
