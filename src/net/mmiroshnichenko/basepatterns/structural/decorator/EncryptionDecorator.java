package net.mmiroshnichenko.basepatterns.structural.decorator;

public class EncryptionDecorator extends DataSourceDecorator{
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    public void encrypt(String data) {
        System.out.print("Encrypt '" + data + "'. ");
    }

    @Override
    public void writeData(String data) {
        encrypt(data);
        super.writeData(data);
    }
}
