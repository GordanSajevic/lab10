package lab10;

import java.util.Scanner;

public class Figura {
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
		
		for (int i=n/2; i>0; i--)
		{
			for (int j=i; j>0; j--)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k=0; k<m-n+p-2; k++)
			{
				System.out.print(" ");
			}
			p+=2;
			System.out.println("*");
		}
		
		/* Širina */
		for (int i = 0; i < m-1; i++)
		{
			System.out.print("*");
		}
		 
		System.out.println("");
		
		/* Opet visina */
		
		for (int i=1; i<n/2; i++)
		{
			for (int j=i; j>0; j--)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k=m-n+p-2; k>2; k--)
			{
				System.out.print(" ");
			}
			p-=2;
			
			System.out.println("*");
		}
		
	}
}
