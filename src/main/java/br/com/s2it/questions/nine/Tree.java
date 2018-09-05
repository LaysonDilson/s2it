package br.com.s2it.questions.nine;

public class Tree {

    BinaryTree root;

    private BinaryTree addRecursive(BinaryTree current, int value) {
        if (current == null) {
            return new BinaryTree(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Integer sumRecursive(BinaryTree current){
        if(current==null)
            return 0;
        return current.value + sumRecursive(current.left)  +sumRecursive(current.right);
    }
    public Integer sumNodesAfter(int nodeValue){
        findNode(nodeValue);
        return sumRecursive(root.left)+sumRecursive(root.right);
    }

    public Integer sumNodesBegning(int nodeValue){
        findNode(nodeValue);
        return sumRecursive(root);
    }

    private BinaryTree findNodeRecursive(BinaryTree current, int value){
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            return current;
        }

        if (value < current.value) {
            return findNodeRecursive(current.left, value);
        }

       return findNodeRecursive(current.right, value);
    }

    public void findNode(int value){
        root = findNodeRecursive(root,value);
    }
}
