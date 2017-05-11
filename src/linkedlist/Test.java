package linkedlist;

public class Test {
	public static void main(String[]args){
		MyLink newlink = new MyLink();
		newlink.add(2);
		newlink.add(4);
		newlink.add(6);
		newlink.add(3);
		newlink.add(10);
		newlink.printlink();
		System.out.println("link.length:"+newlink.length());
		System.out.println(newlink.nexti(3)+"\n");
		newlink.delete(2);
		newlink.printlink();
	}
}
