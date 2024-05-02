package com.saivikas.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeTypes= new HashMap<>();
    public static TreeType getTreeType(String name, String color, String otherTreeData) {
        TreeType treeType = treeTypes.get(name);
        if(treeType == null) {
            treeType = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, treeType);
        }
        return treeType;
    }
    public static int totalTreeTypes() {
        return treeTypes.size();
    }
}
