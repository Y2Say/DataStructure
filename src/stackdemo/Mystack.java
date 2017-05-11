package stackdemo;

public class Mystack extends Throwable {
	private static final long serialVersionUID = -4433344892390700337L;

	protected static int top = -1;
	protected static int capacity;
	protected static int size;

	public int stackDatas[] = null;

	public Mystack(){
	    stackDatas = new int[10];
	    capacity = stackDatas.length;
	}

	public static int size() {
		size = top + 1;
		return size;
	}

	public void push(int data) {
		if (capacity == size()) {
			System.out.println("no memory");
		} else {
			stackDatas[++top] = data;
		}
	}

	public boolean topData() {
		if (top < 0) {
			return true;
		} else {
			System.out.println(stackDatas[top]);
			return false;
		}
	}

	public void pop() {
		if (top < 0) {
			System.out.println("stack is empty");
		} else {
			int temp = stackDatas[top--];
			System.out.println("poped data---> " + temp);
		}
	}

	public String toString() {
		String result = "[";

		if (top < 0) {
			return "[]";
		} else {

			for (int i = 0; i < size(); i++) {
				result = result + stackDatas[i] + ",";
			}
		}

		return result.substring(0, result.lastIndexOf(",")) + "]";
	}
	

	public static void main(String[] args) {

		Mystack ms = new Mystack();
	    ms.push(1);
	    ms.push(2);
	    ms.push(3);
	    ms.push(4);
	    ms.push(5);
	    ms.push(6);
	    ms.push(7);
	    ms.push(8);
	    ms.push(9);
	    ms.push(10);
	    System.out.println("size: "+Mystack.size());
	    System.out.println("List---> "+ms);
	    System.out.println("----------");
	    ms.pop();
	    ms.pop();
	    ms.pop();
	    ms.pop();
	    System.out.println("List---> "+ms);
	    System.out.println("size: "+Mystack.size());

	 }
	
	
	
}
