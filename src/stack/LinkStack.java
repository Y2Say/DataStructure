package stack;

import linkedlist.Link;

public class LinkStack {
	private Link top;

	public LinkStack(int sz) {
		setup();
	}

	// 初始化
	public void setup() {
		top = null;
	}

	// 清空
	public void clear() {
		top = null;
	}

	// 向堆栈压入一个元素
	public void push(Object data) {
		top = new Link(data, top);
	}

	// 弹出一个元素
	public Object pop() {
		while (!isempty()) {
			Object data = top.data();
			top = top.next();
			return data;
		}
		System.out.println("下溢");
		return null;
	}

	// 取出栈顶元素的值
	public Object topvalue() {
		while (!isempty()) {
			return top.data();
		}
		System.out.println("not top value!");
		return null;
	}

	// 判断是否为空
	public boolean isempty() {
		return top == null;
	}
}
