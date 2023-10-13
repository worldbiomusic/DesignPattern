package io.wbm.designpatterns.decorator;

import java.io.IOException;

public class CryptoDecorator extends FilterDataSource {
    public CryptoDecorator(DataSource dataSrc) {
        super(dataSrc);
    }

    @Override
    public int read(byte[] bytes) throws IOException {
        // read data and decrypt
        return super.read(bytes);
    }

    @Override
    public void write(byte[] bytes) throws IOException {
        // encrypt data and write
        super.write(bytes);
    }

}
