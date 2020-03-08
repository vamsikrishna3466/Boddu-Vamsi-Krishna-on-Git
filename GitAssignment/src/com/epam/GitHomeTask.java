package com.epam;
import java.util.*;


public class GitHomeTask {

	public static void main(String[] args) {
		int n;
		System.out.println("MY FIRST EPAM TASK");
		System.out.println(" HERE I AM Finding whether the give element is prime or not");
		Scanner scannerobject=new Scanner(System.in);
		System.out.println("Enter the number");	
		n=scannerobject.nextInt();
		int p=0;
		if(n==1)
			System.out.println("NOT PRIME NUMBER");
		else
		{	
		for(int index=2;index<=Math.sqrt((double)n);index++)
		{
			if(n%index==0)
			{
				p=1;
				System.out.println("NOT PRIME NUMBER");
				break;
			}
		}
		if(p==0)
			System.out.println("PRIME NUMBER");
		}
		
		
	}

}
