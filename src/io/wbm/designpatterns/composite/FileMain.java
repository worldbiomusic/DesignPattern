package io.wbm.designpatterns.composite;

public class FileMain {
    public static void main(String[] args) {
        File fileA = new OneFile("a.txt");
        File fileB = new OneFile("b.txt");
        File fileC = new OneFile("c.txt");

        File dirA = new Directory("A");
        File dirB = new Directory("B");
        File dirC = new Directory("C");

        dirB.addChild(dirC);

        dirA.addChild(fileA);
        dirA.addChild(fileB);

        dirB.addChild(fileB);

        dirC.addChild(fileC);
        dirC.addChild(fileA);

        dirA.print();
        dirB.print();
    }
}
