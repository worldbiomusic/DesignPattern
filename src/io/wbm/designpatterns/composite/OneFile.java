package io.wbm.designpatterns.composite;

import java.util.List;

public class OneFile implements File {
    private String name;

    public OneFile(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public List<File> children() {
        throw new UnsupportedOperationException("AbstractFile can't have children");
    }

    @Override
    public void addChild(File child) {
        throw new UnsupportedOperationException("AbstractFile can't have children");
    }

    @Override
    public void removedChild(String name) {
        throw new UnsupportedOperationException("AbstractFile can't have children");
    }

    @Override
    public void print() {
        System.out.println("File: " + this.name);
    }
}
