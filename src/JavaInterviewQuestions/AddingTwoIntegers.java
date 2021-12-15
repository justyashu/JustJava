package JavaInterviewQuestions;

import java.util.Scanner;

public class AddingTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter number numberOne :");
        System.out.println("Enter number numberTwo :");
        
        int number_One = reader.nextInt();
        int number_Two = reader.nextInt();
        
        int number_Added = number_One + number_Two;
        
        System.out.println(number_Added );
        
        
        //----------or------------
        
        int a=10;
        int b = 20;
        int sum = a+b;
        
        System.out.println("Adding a and b : "+sum);
        
	}

}
