package recursion;

import linkedlist.Link;
import stack.ConsoleReader;

public class Factor {
	//递归--》阶乘
	public static void main(String[]args){
		int num;
		int factorial;
		System.out.println("请输入一个数：");
		ConsoleReader console = new ConsoleReader(System.in);
		num=console.readInt();
		factorial=factor(num);
		System.out.println(num+"!="+factorial);
	}
	public static int factor(int n){
		if(n<=1)
			return 1;
		else
			return n*factor(n-1);
	}
	//非递归--》阶乘
	/*public static void main(String[]args){
		int num;
		int factorial;
		System.out.println("请输入一个数：");
		ConsoleReader console = new ConsoleReader(System.in);
		num=console.readInt();
		Link top=null;
		while(num!=0){
			top=new Link(num,top);
			num--;
		}
		factorial=1;
		while(top!=null){
			Object data=top.data();
			top=top.next();
			factorial=data*factorial;
		}
		return factorial;
	}*/
}
