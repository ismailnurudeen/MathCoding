import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner accept=new Scanner(System.in);
		System.out.println("This is your Mathematics pack");
		System.out.println("	");
		System.out.println("Press 1 for Simple Algebraic Calculator");
		System.out.println("Press 2 for a Quadratic Calculator");
		int aa=accept.nextInt();
		if(aa==1)
		{
			Algebra	Form=new Algebra();
			Scanner input=new Scanner(System.in);
			System.out.println("choose algebra format");

			System.out.println("(1)	aX + b = c");
			System.out.println("(2)	a + bX = c");
			System.out.println("(3)	aX - b = c");
			System.out.println("(4)	a - bX = c");
			int	Style=input.nextInt();

			if(Style==1)
			{	System.out.println("[1]	aX + b = c");

				System.out.print("a=" );

				double a=input.nextDouble();
				//System.out.print("x +");
				System.out.print("b=");
				double b=input.nextDouble();
				System.out.print("c=");
				double c=input.nextDouble();

				double	ageb1=Form.term1(a,b,c);
				System.out.printf("%.0fX + %.0f = %.0f%n X=%.3f",a,b,c,ageb1);
			}
			else if(Style==2)
			{	System.out.println("[2]	a + bX = c");

				System.out.print("a=" );

				double a=input.nextDouble();
				//System.out.print("x +");
				System.out.print("b=");
				double b=input.nextDouble();
				System.out.println("c=");
				double c=input.nextDouble();

				double	ageb1=Form.term2(a,b,c);
				System.out.printf("%.0fX + %.0f = %.0f%n X=%.3f",a,b,c,ageb1);
			}
			else if(Style==3)
			{
				System.out.println("[3]		aX - b = c");

				System.out.print("a=" );

				double a=input.nextDouble();
				//System.out.print("x +");
				System.out.print("b=");
				double b=input.nextDouble();
				System.out.print("c=");
				double c=input.nextDouble();

				double	ageb1=Form.term3(a,b,c);
				System.out.printf("%.0fX + %.0f = %.0f%n X=%.3f",a,b,c,ageb1);
			}
			else if(Style==4)
			{
				System.out.print("[4]	a - bX = c");
				System.out.print("a=" );

				double a=input.nextDouble();
				//System.out.print("x +");
				System.out.print("b=");
				double b=input.nextDouble();
				System.out.print("c=");
				double c=input.nextDouble();

				double	ageb1=Form.term4(a,b,c);
				System.out.printf("%.0fX + %.0f = %.0f%n X=%.3f",a,b,c,ageb1);
			}
			else{
				System.out.println("Unspecified format/invalid format");
			}

		}	
		else if(aa==2)
		{
			{


				/*Declaring new objects of the class 
				 Scanner and Solver*/

				Scanner input=new Scanner(System.in);
				Quadratic bring=new Quadratic();

				System.out.println("The Quadratic formula is:-b±(√b²-4ac)/2a");
				System.out.println("");
				System.out.println("input The Values of The Quadratic Equation");
				System.out.println("In relation to ax²+bx+c=0");
				System.out.println("");

				System.out.print("a=");
				double	A=input.nextDouble();
				System.out.print("b=");
				double	B=input.nextDouble();
				System.out.print("c=");
				double	C=input.nextDouble();
				/*This is to call the Roots 
				 method of the Solver Class*/
				bring.Roots(A,B,C);
			}
		}
	}
}