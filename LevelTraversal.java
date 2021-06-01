package LeetCode.May;

import java.util.ArrayList;
import java.util.List;

public class LevelTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	public class TreeNode {
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


	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> levels = new ArrayList<List<Integer>>();
		
		return levels;
	}
	
	public void traverse(TreeNode a, List<List<Integer>> levels, int depth) {
		
		if(levels.size()-1 < depth) {levels.add(new ArrayList<Integer>());}
		levels.get(depth).add(a.val);
		
		if(a.left != null) {traverse(a.left, levels, depth+1);}
		if(a.right != null) {traverse(a.right, levels, depth+1);}
	}


}
