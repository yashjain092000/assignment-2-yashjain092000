package problem1.mybst;
// to implement BinarySearchTree

import problem1.node.TreeNode;

public class MyBinarySearchTree {
    public TreeNode root;
    public int c = 0;
    int i = 1;

    int j=1;

    private void insertRec(TreeNode latestRoot, TreeNode node) {
        if (latestRoot.value > node.value) {
            if (latestRoot.left == null) {
                latestRoot.left = node;
            } else {
                insertRec(latestRoot.left, node);
            }
        } else {
            if (latestRoot.right == null) {
                latestRoot.right = node;
            } else {
                insertRec(latestRoot.right, node);
            }
        }
    }

    public void print() {
        printRec(root);
        System.out.println("");
        System.out.print(c);
    }

    private void printRec(TreeNode currentRoot) {
        if (currentRoot == null) {
            return;
        }
        System.out.println(i + " element::" + currentRoot.value);
        i++;
        printRec(currentRoot.left);
        printRec(currentRoot.right);
    }

    public void printPostorder() {
        printPostOrderRec(root);
        System.out.println("");
    }

   public void insert(int value) {
        TreeNode node = new TreeNode<>(value);
        if (root == null) {
            root = node;
        } else {
            insertRec(root, node);
        }
    }

    private void printPostOrderRec(TreeNode currRoot) {
        if (currRoot == null) {
            return;
        }
        printPostOrderRec(currRoot.left);
        printPostOrderRec(currRoot.right);
        System.out.println(j + " element::" + currRoot.value);
        j++;
    }
}