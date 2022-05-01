package ques2;

public class MainClass extends TreeConversion {


	public static void main (String[] args)
	 {    
	   
	     TreeConversion tree = new TreeConversion();
	     tree.node = new Node(50);
	     tree.node.left = new Node(30);
	     tree.node.right = new Node(60);
	     tree.node.left.left = new Node(10);
	     tree.node.right.left= new Node(55);
	     
	     int order = 0;
	     convertToRightSkew(node, order);
	     RightSkewTree(head);
	 }
}