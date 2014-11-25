package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {
	private Tree<String> tree;
	private Stack<TreeNode<String>> stack;

	public static void main(String[] args) {
		
	}

	public Main(String file){
		if(file == null){
			throw new NullPointerException();
		}
		else{
			constructQueue(file);
	
		}
	}

	
	public QueueClass<String> constructQueue(String jsonFileName){
		QueueClass<String> queue = new QueueClass<String>();
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader(jsonFileName));
			String bfLine;
			while ((bfLine = bf.readLine()) != null) {
				queue.enqueue(bfLine);
			}

			return queue;

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return queue;
	}
	
	public Tree<String> constructTree(QueueClass<String> queue){
		
		stack = new Stack<TreeNode<String>>();
		TreeNode<String> childNode;
		TreeNode<String> parentNode;
		TreeNode<String> rootNode = new TreeNode<>("root");
		tree = new Tree<String>(rootNode);
		
		while (queue.getSize() > 1) {	
			queue.dequeue();
		}
		return tree;
	}
}
