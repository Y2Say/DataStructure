package stackdemo;

public class Stack {
	private int top;
	private int[] element;

	Stack() {
		element = new int[10];
		top = -1;
	}

	void push(int item) {
		
		if (top >= 9) {
			System.out.println("Overflow");
			return;
		}
		top++;
		element[top] = item;
	}

	void pop() {
		if (top == -1)
			System.out.println("Underflow");
		else
			top--;
	}

	int length() {
		int len = ++top;
		return len;
	}

	void display() {
		System.out.println("\nTop=" + top + "\nElement=" + element[top]);
	}

	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.push(1);
		s1.display();
		s1.push(2);
		s1.display();
		s1.push(3);
		s1.display();
		s1.push(4);
		s1.display();
		s1.push(5);
		s1.display();
		s1.push(6);
		s1.display();
		s1.push(7);
		s1.display();
		s1.push(8);
		s1.display();
		s1.push(9);
		s1.display();
		s1.push(10);
		s1.display();
		System.out.println("s1.length=" + s1.length());
		/*
		 * s1.pop(); s1.pop(); System.out.println("s1.length="+s1.length());
		 */
	}
}
