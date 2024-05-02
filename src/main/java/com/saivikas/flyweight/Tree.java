package com.saivikas.flyweight;

public class Tree {
    private final int x;
    private final int y;
    private final TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        System.out.printf("Tree drawn at (%d, %d) with type %s\n", x, y, treeType);
    }
}
