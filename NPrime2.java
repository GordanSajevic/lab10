package lab10;

import java.util.Scanner;

public class NPrime2 extends NPrime {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Enter number: ");
		int n = unos.nextInt();
		int notPrime=0;
		int brojac=0;
		for (  int i=2; i<n*n; i++)
		{
			notPrime=0;
			for (int j=2; j<i; j++)
			{
				if (i%j==0)
				{
					notPrime++;
			
			}
			}
			
			if (notPrime==0)
			{
				brojac++;
				if (brojac==n)
				{
					System.out.println(i);
				}
			}
			
		}
		

	}

}
