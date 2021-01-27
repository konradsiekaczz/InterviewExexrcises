package com.company;

import java.util.*;

public class LevelSum {

    // Please do not change this interface
    public static interface Node {
        int getValue();

        List<Node> getChildren();
    }


    static class NodeC implements Node {
        private int value;
        private List<Node> children;

        public NodeC() {
            this.value = 0;
            children = null;
        }

        public NodeC(int value, List<Node> children) {
            this.value = value;
            this.children = children;
        }

        public int getValue() {
            return value;
        }

        public List<Node> getChildren() {
            return children;
        }
    }


    /**
     * Please implement this method to
     * traverse the tree and return the sum of the values (Node.getValue()) of all nodes
     * at the level N in the tree.
     * Node root is assumed to be at the level 0. All its children are level 1, etc.
     */
    public static int getLevelSum(Node root, int n) {
        return -1;
    }
}
