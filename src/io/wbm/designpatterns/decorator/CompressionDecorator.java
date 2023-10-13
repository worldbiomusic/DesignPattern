package io.wbm.designpatterns.decorator;

import java.io.IOException;

public class CompressionDecorator extends FilterDataSource {
    public CompressionDecorator(DataSource dataSrc) {
        super(dataSrc);
    }

    @Override
    public int read(byte[] bytes) throws IOException {
        // read data and decompress
        return super.read(bytes);
    }

    @Override
    public void write(byte[] bytes) throws IOException {
        // compress data and write
        super.write(bytes);
    }
}
