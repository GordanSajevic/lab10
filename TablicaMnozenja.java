package lab10;

import java.util.Scanner;

public class TablicaMnozenja {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int broj = unos.nextInt();
		for (int i=0; i<=broj*3; i++)
		{
			System.out.print("- ");
		}
		System.out.println("");
		for (int i=1; i<=broj; i++)
		{
			for (int j=1; j<=broj; j++)
			{
				System.out.printf("| %4d ", i*j);
			}
			System.out.println("");
		}
		for (int i=0; i<=broj*3; i++)
		{
			System.out.print("- ");
		}
	}

}
