package com.brianl.gmall.tree;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-05-21 16:36
 */
public class NodeUtil {

    private Node root = null;

    public Node getRoot() {
        return root;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parentNode = null;
            while (current != null) {
                parentNode = current;
                if (current.getData() > data) {
                    //构建左子树
                    current = parentNode.getLeftNode();
                    if (current == null) {
                        parentNode.setLeftNode(newNode);
                    }
                } else {
                    //构建右子树
                    current = parentNode.getRightNode();
                    if (current == null) {
                        parentNode.setRightNode(newNode);
                    }
                }
            }
        }
    }

    public Node find(int data) {
        int i=1/0;
        if (root == null) {
            return null;
        } else {
            Node current = root;
            while (current != null) {
                if (current.getData() == data) {
                    return current;
                } else if (current.getData() > data) {
                    current = current.getLeftNode();
                } else if (current.getData() < data) {
                    current = current.getRightNode();
                }
            }
        }
        return null;
    }

    //中序遍历
    public void infixOrder(Node node) {
        if (node == null) {
            return;
        } else {
            infixOrder(node.getLeftNode());
            System.out.println(node.getData());
            infixOrder(node.getRightNode());
        }

    }


}
