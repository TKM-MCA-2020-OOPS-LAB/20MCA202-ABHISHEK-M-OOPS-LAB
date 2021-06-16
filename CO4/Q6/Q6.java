package test;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
	class fibonacci implements Runnable{
		public void run(){
			int n=10, a=0, b=1;
			Scanner sc= new Scanner(System.in);
			System.out.println("Fibonacci Series for " + n + " terms:");
			for (int i=1;i<=n;i++) 
			{
			      System.out.print(a + " \n");
			      int nextTerm = a+b;
			      a=b;
			      b=nextTerm;
			}
		}
	}
	class Even implements Runnable{
		public void run() {
			int n, i;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Limit for Even numbers : ");
			n = sc.nextInt();	
			for(i = 1; i <= n; i++)
			{
				if(i % 2 == 0)
				{
					System.out.print(i +"\n"); 
				}
		  }
				
	   }  
	}
	public class c4_Q6
	{
			public static void main(String[] args) throws InterruptedException {
				fibonacci f = new fibonacci();
				Thread t1=new Thread(f);
				Even e = new Even();
				Thread t2= new Thread(e);
				t1.start();
				t1.sleep(200);
				t2.start();
				t2.sleep(200);
		    }
		}