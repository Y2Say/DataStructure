package tree;

import stack.ConsoleReader;

public class BinTree01 {
	public static void main(String[] args) {

		int index = 1;// 数组下标变量
		int data;// 读取输入值的临时变量
		BinTreeArray bta = new BinTreeArray();// 声明二叉树组
		System.out.println("请输入二叉树数据元素（输入0退出！）：");

		ConsoleReader console = new ConsoleReader(System.in);
		/*
		 * do//依次序读取结点值 { System.out.println("data"+index+":");
		 * data=console.readInt(); bta.create(data);//建立二叉树 index++;
		 * }while(data!=0);
		 */
		System.out.println("data" + index + ":");
		data = console.readInt();
		bta.treeData[0] = data;
		index++;
		while (true) {
			System.out.println("data" + index + ":");
			data = console.readInt();
			if (data == 0)
				break;
			bta.create(data);// 建立二叉树
			index++;
		}
		bta.printAll();// 输出二叉树的内容
	}
}
