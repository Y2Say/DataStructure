package stack;

import linkedlist.Link;

public class LinkStack {
	private Link top;

	public LinkStack(int sz) {
		setup();
	}

	// ��ʼ��
	public void setup() {
		top = null;
	}

	// ���
	public void clear() {
		top = null;
	}

	// ���ջѹ��һ��Ԫ��
	public void push(Object data) {
		top = new Link(data, top);
	}

	// ����һ��Ԫ��
	public Object pop() {
		while (!isempty()) {
			Object data = top.data();
			top = top.next();
			return data;
		}
		System.out.println("����");
		return null;
	}

	// ȡ��ջ��Ԫ�ص�ֵ
	public Object topvalue() {
		while (!isempty()) {
			return top.data();
		}
		System.out.println("not top value!");
		return null;
	}

	// �ж��Ƿ�Ϊ��
	public boolean isempty() {
		return top == null;
	}
}
