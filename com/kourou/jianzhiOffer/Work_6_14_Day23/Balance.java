package com.kourou.jianzhiOffer.Work_6_14_Day23;

import java.util.*;

 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class Balance {
    public boolean isBalance(TreeNode root) {
        if (root == null){
            return true;
        }
        int leftHigh = getHigh(root.left);
        int rightHigh = getHigh(root.right);

        if (Math.abs(leftHigh - rightHigh) > 1)
        return false;
        return isBalance(root.left) && isBalance(root.right);
    }
    //计算树的高度
    public static int getHigh(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(getHigh(root.left),getHigh(root.right)) + 1;
    }
}
