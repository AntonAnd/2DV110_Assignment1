package main;

import java.io.*;

public class Main {
	private Tree<String> tree;
	private Stack<TreeNode<String>> stack;

	public Main(String file) {
		if (file == null) {
			throw new NullPointerException();
		} else {
			constructQueue(file);

		}
	}

	public QueueClass<String> constructQueue(String jsonFileName) {
		QueueClass<String> queue = new QueueClass<>();

		try {
			BufferedReader bf = new BufferedReader(new FileReader(jsonFileName));
			String bfLine;
			while ((bfLine = bf.readLine()) != null) {
				queue.enqueue(bfLine);
			}
		} catch (Exception e) {
			System.out.println("File not found!");
		}

		return queue;
	}

	public Tree<String> constructTree(QueueClass<String> queue) {

		stack = new Stack<>();
		TreeNode<String> childNode;
		TreeNode<String> parentNode;
		TreeNode<String> rootNode = new TreeNode<>("root");
		tree = new Tree<>(rootNode);

		while (queue.getSize() > 1) {
			childNode = new TreeNode<>(queue.dequeue());

			if (childNode.toString().equalsIgnoreCase("}")
					|| childNode.toString().equalsIgnoreCase("]")) {
				stack.pop();
			}

			parentNode = stack.peek();
			tree.addChild(parentNode, childNode);

			if (childNode.isJsonArray() || childNode.isJsonObject()) {
				stack.push(childNode);
			}
		}

		return tree;
	}

	/**
	 * Prints out the tree.
	 */
	public void printTree(Tree<String> jsonTree) {
		jsonTree.printTree();
	}
}
