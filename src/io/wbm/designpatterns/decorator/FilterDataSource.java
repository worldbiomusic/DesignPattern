package io.wbm.designpatterns.decorator;

import java.io.IOException;

public class FilterDataSource implements DataSource {
    DataSource dataSrc;

    public FilterDataSource(DataSource dataSrc) {
        this.dataSrc = dataSrc;
    }

    @Override
    public int read(byte[] bytes) throws IOException {
        return this.dataSrc.read(bytes);
    }

    @Override
    public void write(byte[] bytes) throws IOException {
        this.dataSrc.write(bytes);
    }
}
