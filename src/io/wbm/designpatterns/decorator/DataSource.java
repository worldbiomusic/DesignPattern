package io.wbm.designpatterns.decorator;

import java.io.IOException;

public interface DataSource {
    int read(byte[] bytes) throws IOException;
    void write(byte[] bytes)throws IOException;
}
