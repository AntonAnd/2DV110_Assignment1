package main;

import java.util.ArrayList;

public class TreeNode<E> {

	TreeNode<E> parent;
	ArrayList<TreeNode<E>> children;
	E data;
	
	public TreeNode(){
		children = new ArrayList<>();
	}
	
	public ArrayList<TreeNode<E>> getChildren(){
		return children;
	}
	
	public TreeNode<E> getParent(){
		return parent;
	}
	
	public void setParent(TreeNode<E> parent){
		if(parent == null){
			throw new IllegalArgumentException();
		}
		this.parent = parent;
	}
}