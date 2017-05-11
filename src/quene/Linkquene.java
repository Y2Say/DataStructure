package quene;

import linkedlist.Link;

public class Linkquene {
	private Link front;
	private Link rear;

	public Linkquene() {
		setup();
	}

	public Linkquene(int sz) {
		setup();
	}

	// 初始化
	private void setup() {
		front = rear = null;
	}

	// 清空队列
	public void clear() {
		front = rear = null;
	}

	// 插入元素
	public void enquene(Object data) {
		if (rear != null) {
			rear.setNext(new Link(data, null));
			rear = rear.next();
		} else
			front = rear = new Link(data, null);
	}

	// 删除元素
	public Object dequene() {
		if (isEmpty()) {
			System.out.println("队列为空！");
			return null;
		}
		Object data = front.data();
		front = front.next();
		if (front == null)
			rear = null;
		return data;
	}

	// 取队首元素
	public Object firstvalue() {
		if (!isEmpty()) {
			return front.data();
		}
		return null;
	}

	// 判断是否为空
	public boolean isEmpty() {
		return front == null;
	}
}
