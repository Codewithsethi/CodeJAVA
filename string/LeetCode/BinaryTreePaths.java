/*
 Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

    1
   / \
  3   2
 /
5


Example 1:


Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
Example 2:

Input: root = [1]
Output: ["1"]
 

Constraints:

The number of nodes in the tree is in the range [1, 100].
-100 <= Node.val <= 100
 */

  //Definition for a binary tree node.

import java.util.List;
import java.util.ArrayList;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
         this.right = right;
     }
 }
 
public class BinaryTreePaths {
    
    private static void dfs(TreeNode node, String path, List<String> result) {
        if (node == null) {
            return;
        }

        // Append current node's value to the path
        path += node.val;

        System.out.println("Visiting Node: " + node.val + " | Current Path: " + path); // Debug print

        // If it's a leaf node, add the path to result
        if (node.left == null && node.right == null) {
            System.out.println("Leaf Node Found: " + path); // Debug print
            result.add(path);
        } else {
            // Otherwise, explore both left and right subtrees
            path += "->"; // Add "->" to separate nodes in the path
            if (node.left != null) {

                dfs(node.left, path, result);
            }
            if (node.right != null) {
                dfs(node.right, path, result);
            }
      
        }
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        
        List<String> result = new ArrayList<>();

        if(root != null) {
            dfs(root, "", result);
        }
        return result;
   
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        System.out.println(binaryTreePaths(root));
       
    }
}
