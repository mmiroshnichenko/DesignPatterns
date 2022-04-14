package net.mmiroshnichenko.basepatterns.structural.decorator;

public class FileDataSource implements DataSource{

    @Override
    public void writeData(String data) {
        System.out.println("Write '" + data + "' in file data source");
    }
}
