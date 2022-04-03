package com.hokage.projectfang.recursion;

import com.hokage.projectfang.common.TreeNode;
import lombok.val;

public class MaxDepth {
    int result = 0;
    public int maxDepth(TreeNode root) {
       return findDepth(root);
    }

    private int findDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
       int level =Math.max(findDepth(root.left) , findDepth(root.right));
        root.val = level+1;
        return root.val;
    }
}
