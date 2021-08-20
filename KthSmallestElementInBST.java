// Time complexity: O(N)
// Space complexity: O(H) height of the tree
// Run on leetcode: Yes
// Issues faced: None

class Solution {
    int counter = 0;
    int var = -1;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return var;
    }
    
    private void dfs(TreeNode root, int k){
        if(root == null)
            return;
        dfs(root.left, k);
        counter++;
        if(counter == k){
            var = root.val;
            return;
        }
        if(var == -1)
            dfs(root.right, k);
    }
}

// Time complexity: O(N)
// Space complexity: O(H) height of the tree
// Run on leetcode: Yes
// Issues faced: None

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
        root = stack.pop();
        k--;
        if(k == 0)
            return root.val;
        root = root.right;
        }
        return -1;
    }
}
