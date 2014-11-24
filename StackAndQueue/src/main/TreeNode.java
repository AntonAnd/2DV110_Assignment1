package main;

import java.util.ArrayList;

/**
 * This class represents a TreeNode.
 * @author Anton
 */
public class TreeNode<E> {

	TreeNode<E> parent;
	ArrayList<TreeNode<E>> children;
	E data;
	
	/**
	 * Constructor that takes any kind of data as input.
	 * @param inputData The data that will be stored in this TreeNode.
	 */
	public TreeNode(E inputData){
		if(inputData == null){
			throw new NullPointerException("value is null");
		}
		else{
			children = new ArrayList<>();
			data = inputData;
		}
	}
	
	/**
	 * Returns an ArrayList of this TreeNode's children.
	 * @return ArrayList that contains other TreeNodes.
	 */
	public ArrayList<TreeNode<E>> getChildren(){
		return children;
	}
	
	/**
	 * Returns this TreeNode's parent.
	 * @return This TreeNode's parent of type TreeNode.
	 */
	public TreeNode<E> getParent(){
		return parent;
	}
	
	/**
	 * Sets the parent of this TreeNode.
	 * @param parent The TreeNode that will be the parent.
	 */
	public void setParent(TreeNode<E> parent){
		if(parent == null){
			throw new IllegalArgumentException();
		}
		this.parent = parent;
	}
	
	/**
	 * Returns the data.
	 * @return the data of this TreeNode.
	 */
	public E getData(){
		return data;
	}
	
	/**
	 * Checks if the current String is the start of a Json object.
	 * @return True if String is start of Json object, else false.
	 */
	public boolean isJsonObject(){
		if(data.toString().equalsIgnoreCase("{")){
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if the current String is the start of a Json Array.
	 * @return True if String is start of Json array, else false.
	 */
	public boolean isJsonArray(){
		if(data.toString().equalsIgnoreCase("[")){
			return true;
		}
		return false;
	}
}
