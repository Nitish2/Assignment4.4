package Average;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		if ( num== 0) 
		{
			System.out.println("You have entered ZERO ");
			String char1 = null;
			System.out.println("ASCII value of number is" + (char)num);
		} 
		else if (num > 0) 
		{
			System.out.println("You have entered +ve value ");
		} else 
		{
			System.out.println("You have entered -ve value ");
		}
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the marks of Physics ");
		int x = in.nextInt();
		System.out.print("Enter the marks of Chemistry ");
		int y = in.nextInt();
        System.out.print("Enter the marks of Maths");
		int z = in.nextInt();

		int p = x, c = y, m = z,avg;
		avg = (p + c + m) / 3;
		
		if (avg > 70) 
		{
			System.out.println("Grade A");
		}
		
			if ((avg > 60) && (avg <=70))
			{
				System.out.println("Grade B");
			}
				if (avg < 61) 
				{
					System.out.println("Grade C");
				}

				}


	}

