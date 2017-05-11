package linkedlist2;

public class Test {
	public static void main(String[]args){
		LinkedList linkedList = new LinkedList();
		linkedList.add(3);
		linkedList.add(66);
		linkedList.add(5);
		linkedList.add(18);
	/*	linkedList.append(32);*/
		linkedList.printDlink();
		System.out.println("linkedList.length:"+linkedList.length());
	}
}
