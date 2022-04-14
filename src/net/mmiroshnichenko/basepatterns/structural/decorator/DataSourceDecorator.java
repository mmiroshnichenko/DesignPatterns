package net.mmiroshnichenko.basepatterns.structural.decorator;

public class DataSourceDecorator implements DataSource{
    DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }
}
