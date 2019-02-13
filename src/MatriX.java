import java.util.*;
public class MatriX
{
	public static void main(String args[])
	{
		int row, cln, row2, cln2, sum = 0, c, d, k; 

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of first matrix");
		row= in.nextInt(); 
		cln = in.nextInt(); 
		int first[][] = new int[row][cln]; 
		System.out.println("Enter the elements of first matrix"); 
		for (c = 0; c <row; c++)
		{
			for (d = 0; d <cln; d++)
			{
				first[c][d] = in.nextInt();
				}
			}
		System.out.println("Enter the number of rows and columns of second matrix"); 
		row2 = in.nextInt();
		cln2= in.nextInt(); 
		if (row!= cln2)
		{
			System.out.println("Matrices with entered orders can't be multiplied with each other.");
			}
		else {
			int second[][] = new int[row2][cln2];
			int multiply[][] = new int[row][cln2];
			System.out.println("Enter the elements of second matrix"); 
			for (c = 0; c <row2; c++) 
			{
				for (d = 0; d < cln2; d++)
				{
					second[c][d] = in.nextInt(); 
					}
				}
				
	//The Part of the code that I don't understand 
			
for (c = 0; c < row; c++)
	{
		for (d = 0; d <cln2; d++)
			{
				for (k = 0; k < cln2; k++) 
					{ 
						sum = sum + first[c][k] * second[k][d];
							} 
				multiply[c][d] = sum;
				sum = 0; 
						} 
					}
		System.out.println("Product of entered matrices:-"); 
		
		for (c = 0; c <row; c++)
			{ 
				for (d = 0; d< cln2; d++) 
				{
					System.out.print(multiply[c][d] + "\t"); 
					System.out.print("\n"); 
					} 
			} 
		} 
	}
}