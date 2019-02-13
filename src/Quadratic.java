public class Quadratic
{	

	public static void Roots(double a,double b,double c)
	{
		double Rrt1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))
			/(2*a);
		double Rrt2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))
			/(2*a);
		System.out.printf("1st Root is %.2f %n 2nd Root is %.2f",Rrt1,Rrt2);


	}
}