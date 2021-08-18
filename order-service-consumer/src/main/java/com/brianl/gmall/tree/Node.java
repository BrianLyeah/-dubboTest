package com.brianl.gmall.tree;

import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-05-21 16:34
 */
@Data
public class Node {
    private Integer data;
    private Node leftNode;
    private Node rightNode;


    public Node(Integer data1){
        this.data=data1;
    }
}
