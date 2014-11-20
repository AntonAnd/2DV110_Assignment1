package main;

import java.util.ArrayList;

public class TreeNode<E> {

	TreeNode<E> parent;
	ArrayList<TreeNode<E>> children;
	E data;
	
	public ArrayList<TreeNode<E>> getChildren(){
		return children;
	}
}
