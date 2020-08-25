package com.coffeepoweredcrew.flyweight.ex2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


import java.awt.*;

public class Forest extends Frame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3858779576029670690L;
	private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}