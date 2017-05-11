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

	// ��ʼ��
	private void setup() {
		front = rear = null;
	}

	// ��ն���
	public void clear() {
		front = rear = null;
	}

	// ����Ԫ��
	public void enquene(Object data) {
		if (rear != null) {
			rear.setNext(new Link(data, null));
			rear = rear.next();
		} else
			front = rear = new Link(data, null);
	}

	// ɾ��Ԫ��
	public Object dequene() {
		if (isEmpty()) {
			System.out.println("����Ϊ�գ�");
			return null;
		}
		Object data = front.data();
		front = front.next();
		if (front == null)
			rear = null;
		return data;
	}

	// ȡ����Ԫ��
	public Object firstvalue() {
		if (!isEmpty()) {
			return front.data();
		}
		return null;
	}

	// �ж��Ƿ�Ϊ��
	public boolean isEmpty() {
		return front == null;
	}
}
