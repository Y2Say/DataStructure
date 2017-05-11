package stackdemo;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		System.out.println("************  Playing with a Integer Stack  ****************");
		final int SIZE=5;
		IntegerStack myStack = new IntegerStack(SIZE);
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer to push onto the stack - OR - 'q' to Quit");
		while(scan.hasNextInt()){
			int i=scan.nextInt();
			myStack.push(i);
			System.out.println("Pushed"+i);
		}
		System.out.println("Lets pop 2 elements from the stack");
		int count=0;
		while(!myStack.isEmpty()&&count<2){
			System.out.println("Popped"+myStack.pop());
			count++;
		}
		scan.next();
		System.out.println("Push in a few more elements - OR - enter q to quit");
		while(scan.hasNextInt()){
			int i=scan.nextInt();
			myStack.push(i);
			System.out.println("Pushed"+i);
		}
		System.out.println("\nThe final contentes of the stack are:");
		while(!myStack.isEmpty()){
			System.out.println("Popped"+myStack.pop());
		}
	}
	

}
