package io.wbm.designpatterns.decorator;

import java.io.*;

public class FileDataSource implements DataSource {
    File file;
    InputStream is;
    OutputStream os;

    public FileDataSource(String fileName) {
        this.file = new File("a.txt");
        try {
            is = new FileInputStream(file);
            os = new FileOutputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int read(byte[] bytes) throws IOException {
        return this.is.read(bytes);
    }

    @Override
    public void write(byte[] bytes) throws IOException{
        this.os.write(bytes);
    }
}
