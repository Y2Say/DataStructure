package tree;

import stack.ConsoleReader;

public class BinTree01 {
	public static void main(String[] args) {

		int index = 1;// �����±����
		int data;// ��ȡ����ֵ����ʱ����
		BinTreeArray bta = new BinTreeArray();// ������������
		System.out.println("���������������Ԫ�أ�����0�˳�������");

		ConsoleReader console = new ConsoleReader(System.in);
		/*
		 * do//�������ȡ���ֵ { System.out.println("data"+index+":");
		 * data=console.readInt(); bta.create(data);//���������� index++;
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
			bta.create(data);// ����������
			index++;
		}
		bta.printAll();// ���������������
	}
}
