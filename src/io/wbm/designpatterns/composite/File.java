package io.wbm.designpatterns.composite;

import java.util.List;

public interface File {
    String name();
    List<File> children();
    void addChild(File child);
    void removedChild(String name);
    void print();
}
