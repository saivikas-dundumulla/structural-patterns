package com.saivikas.flyweight;

public class Forest {
    public static void main(String[] args) {
        TreeType treeType1 = TreeFactory.getTreeType("Pine", "Green", "Pine tree data");
        TreeType treeType2 = TreeFactory.getTreeType("Maple", "Red", "Maple tree data");
        TreeType treeType3 = TreeFactory.getTreeType("Pine", "Green", "Pine tree data");
        TreeType treeType4 = TreeFactory.getTreeType("Maple", "Red", "Maple tree data");
        TreeType treeType5 = TreeFactory.getTreeType("Pine", "Green", "Pine tree data");
        TreeType treeType6 = TreeFactory.getTreeType("Maple", "Red", "Maple tree data");
        TreeType treeType7 = TreeFactory.getTreeType("Pine", "Green", "Pine tree data");
        TreeType treeType8 = TreeFactory.getTreeType("Maple", "Red", "Maple tree data");
        TreeType treeType9 = TreeFactory.getTreeType("Pine", "Green", "Pine tree data");
        TreeType treeType10 = TreeFactory.getTreeType("Maple", "Red", "Maple tree data");

        Tree tree1 = new Tree(1, 1, treeType1);
        Tree tree2 = new Tree(2, 2, treeType2);
        Tree tree3 = new Tree(3, 3, treeType3);
        Tree tree4 = new Tree(4, 4, treeType4);
        Tree tree5 = new Tree(5, 5, treeType5);
        Tree tree6 = new Tree(6, 6, treeType6);
        Tree tree7 = new Tree(7, 7, treeType7);
        Tree tree8 = new Tree(8, 8, treeType8);
        Tree tree9 = new Tree(9, 9, treeType9);
        Tree tree10 = new Tree(10, 10, treeType10);

        tree1.draw();
        tree2.draw();
        tree3.draw();
        tree4.draw();
        tree5.draw();
        tree6.draw();
        tree7.draw();
        tree8.draw();
        tree9.draw();
        tree10.draw();

        System.out.println("Total tree types created: " + TreeFactory.totalTreeTypes());
    }
}
