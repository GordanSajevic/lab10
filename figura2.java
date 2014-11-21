package lab10;

import java.util.Scanner;

public class figura2 {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite širinu figure:");
		int m = unos.nextInt();
		System.out.println("Unesite visinu figure: ");
		int n = unos.nextInt();
		int p=0;
		while (m<n) {
			System.out.println("Širina mora biti veća od dužine!: Ponovite unos.");
			System.out.println("Unesite širinu figure:");
			m = unos.nextInt();
			System.out.println("Unesite visinu figure: ");
			n = unos.nextInt();
		}
		
		/*Visina */
		
		for (int i=0; i<n/2; i++)
		{
			
			for (int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
			for (int j=m+n-i-p-2; j>0; j--)
			{
				System.out.print(" ");
			}
			System.out.println("*");
			p=p+1;
		}
		/* Širina */
		for (int j=n/2; j>0; j--)
		{
			System.out.print(" ");
		}
		for (int j=m; j>=0; j--)
		{
			System.out.print("*");
		}
		 
		System.out.println("");
		
		/* Opet visina */
		
		for (int i=n/2; i>0; i--)
		{
			
			for (int j=i-1; j>0; j--)
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
			for (int j=0; j<m+n-i-p; j++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
			p=p-1;
		}
		
	}
}
