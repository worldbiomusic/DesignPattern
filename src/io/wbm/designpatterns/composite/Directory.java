package io.wbm.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File {
    private String name;
    private List<File> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public List<File> children() {
        return this.children;
    }

    @Override
    public void addChild(File child) {
        this.children.add(child);
    }

    @Override
    public void removedChild(String name) {
        this.children.removeIf(c -> c.name().equals(name));
    }

    @Override
    public void print() {
        System.out.println("Directory: " + this.name);
        System.out.println("=== Children ===");
        this.children.forEach(c-> c.print());
        System.out.println("================");
    }
}
