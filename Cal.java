import java.util.Scanner;
class Calculator{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------welcome---------------");
		int run = 5;
		Calc op = new Calc();
		while(run == 5)
		{	System.out.println("\n");
			System.out.println(" choose 1 for addition");
			System.out.println(" choose 2 for subtraction");
			System.out.println(" choose 3 for multiplication");
			System.out.println(" choose 4 for division ");
			System.out.println(" choose 5 for power ");
			System.out.println(" choose 0 to exit ");

			int inn = sc.nextInt();
			switch(inn)
			{ case 1: System.out.println(" enter the first number: ");
					int a = sc.nextInt();
					System.out.println(" enter the second number: ");
					int b = sc.nextInt();
					System.out.println(" \u001B31; sum of number is: " + op.add(a, b) + "\n");
					break;
					
			 case 2: System.out.println(" enter the first number: ");
					int c = sc.nextInt();
					System.out.println(" enter the second number: ");
					int d = sc.nextInt();
					System.out.println(" subtraction of numbers is: " + op.sub(c, d));
					break;
			 case 3: System.out.println(" enter the first number: ");
					int e = sc.nextInt();
					System.out.println(" enter the second number: ");
					int f = sc.nextInt();
					System.out.println(" multiplication of numbers is: " + op.mul(e, f));
					break;
			 case 4: System.out.println(" enter the first number: ");
					int g = sc.nextInt();
					System.out.println(" enter the second number: ");
					int h = sc.nextInt();
					System.out.println(" result is: " + op.div(g, h));
					break;
			 case 5: System.out.println(" enter the  number: ");
					int i = sc.nextInt();
					System.out.println(" enter the power: ");
					int j = sc.nextInt();
					System.out.println(" result is: " + op.power(i,j));
					break;
			 case 0: run=4;
			 		System.out.println("thank you");

			}


		}
	}

}



