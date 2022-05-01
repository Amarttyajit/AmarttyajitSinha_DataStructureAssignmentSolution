package ques1;

import java.util.EmptyStackException;
import java.util.Stack;

public class SkyscraperConstruction {
	
	  Stack<Integer> stack= new Stack<Integer>();

	public void orderOfConstruction( int arr[], int size)
	{ 
		stack.push(arr[0]);
	for(int i=1; i<=size; i++)
	{   
		System.out.println("Day " + i +": ");
		if(arr[i]>arr[i-1])
		{
			stack.push(arr[i]);
		}
		else
		{
			try
			{
			while(!stack.isEmpty() && arr[i]<stack.peek() )
			{
			System.out.print(stack.pop() + " ");	
			}			
			stack.push(arr[i]);
			}
			catch(EmptyStackException e)
			{
				System.err.println("");
			}
			
		
		}
		System.out.println();
	}
		
		
	}
}
