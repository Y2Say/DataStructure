package linkedlist2;

public class LinkedList {
	Dlink pre = null;
	Dlink next = null;
	Dlink curr = null;
	Dlink head = null;
	Dlink tail;

	// ����Ԫ��
	public void add(Object data) {
		Dlink newlink = new Dlink(data);
		if (head == null) {
			head = newlink;
			return;
		}

		Dlink dlink = head;
		while (dlink.next != null) {
			dlink = dlink.next;
		}
		dlink.next = newlink;
	}

	// ����һ��Ԫ��
	public void insert(Object data) {
		Dlink dlink = new Dlink(data);
		if (data == null) {
			System.out.println("data not exist");
			return;
		}
		if (head == null || curr == null) {
			head = dlink;
			return;
		}
		curr.setNext(new Dlink(data, curr.next(), curr));
		if (curr.next().next() != null) {
			curr.next().next().setPre(curr.next);
		}
		if (tail == curr) {
			tail = tail.next;
		}

	}

	// �Ƴ�һ��Ԫ��
	public Object remove() {
		Object data = curr.next().data();
		if (curr.next().next() != null)
			curr.next().next().setPre(curr);
		else
			tail = curr;
		curr.setNext(curr.next().next());
		return data;
	}

	// ������
	public int length() {
		int length = 0;
		curr = head;
		while (curr != null) {
			curr = curr.next;
			length++;
		}
		return length;
	}

	// ��ӡ��������
	public void printDlink() {
		curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

	// ��β�����һ��Ԫ��
	public void append(Object data) {

		tail.setNext(new Dlink(data, null, tail));
		tail = tail.next;
	}
}
