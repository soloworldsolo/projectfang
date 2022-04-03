package com.hokage.projectfang.recursion;

import com.hokage.projectfang.common.TreeNode;

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        var current = root;
        while (current != null && current.val != val) {
            if (current.val > val) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return current;
    }
}
