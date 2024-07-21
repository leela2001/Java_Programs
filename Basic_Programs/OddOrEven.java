import java.util.Scanner;

public class OddOREven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		number = sc.nextInt();
		
//		1 st method
		
		if(number % 2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
		
//		2nd method
 		
		String oddOrEven = number % 2 == 0 ? "Even" : "Odd" ;
		System.out.println(oddOrEven);


		// 3Rd method
		
		if((number&1)==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
		
	}
	

}
