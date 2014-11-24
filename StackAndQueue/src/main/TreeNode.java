package main;

import java.util.ArrayList;

public class TreeNode<E> {

	TreeNode<E> parent;
	ArrayList<TreeNode<E>> children;
	E data;
	
	public TreeNode(E inputData){
		children = new ArrayList<>();
		data = inputData;
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
	
	public E getData(){
		return data;
	}
	
	public boolean isJsonObject(){
		if(data.toString().equalsIgnoreCase("{")){
			return true;
		}
		return false;
	}
	
	public boolean isJsonArray(){
		if(data.toString().equalsIgnoreCase("[")){
			return true;
		}
		return false;
	}
}
