package ques2;

public class TreeConversion
{
 public static Node node;
 static Node prevNode = null;
 public static Node head = null;

 // flattened BST to right skewed tree
 public static void convertToRightSkew(Node root,int order)
 {
     if(root == null)
     {
         return;
     }
    
     if(order > 0)
    	 convertToRightSkew(root.right, order);
     else
    	 convertToRightSkew(root.left, order);
     
     
     Node rightNode = root.right;
     Node leftNode = root.left;
    
     if(head == null)
     {
         head= root;
         root.left = null;
         prevNode = root;
     }
     else
     {
         prevNode.right = root;
         root.left = null;
         prevNode = root;
     }
 
     if (order > 0)
    	 convertToRightSkew(leftNode, order);
     else
    	 convertToRightSkew(rightNode, order);
 }
// traversal through the new right skewed tree
 public static void RightSkewTree(Node root)
 {
     if(root == null)
     {
         return;
     }
     System.out.print(root.val + " ");
     RightSkewTree(root.right);       
 }
}