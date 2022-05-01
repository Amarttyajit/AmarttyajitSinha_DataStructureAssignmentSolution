package ques1;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int fsize = scan.nextInt();
		int arr[]=new int[fsize+1];
		for(int i=0;i<fsize;i++)
		{
			System.out.println("enter the floor size given on day :" + (i+1));
			arr[i]=scan.nextInt();
		}
		arr[fsize]=0;
		SkyscraperConstruction sc =new SkyscraperConstruction ();
		sc.orderOfConstruction(arr,fsize);
	}

}
