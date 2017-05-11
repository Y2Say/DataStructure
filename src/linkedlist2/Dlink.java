package linkedlist2;

public class Dlink {

	Object data;
	Dlink next;
	Dlink pre;

	public Dlink(Object data, Dlink next, Dlink pre) {
		super();
		this.data = data;
		this.next = next;
		this.pre = pre;
	}
	
	public Dlink(Object data) {
		this.data = data;
	}

	public Dlink(Dlink next, Dlink pre) {
		this.next = next;
		this.pre = pre;
	}

	Dlink next() {
		return next;
	}

	Dlink pre() {
		return pre;
	}

	Object data() {
		return data;
	}

	public void setPre(Dlink pre) {
		this.pre = pre;
	}

	public void setNext(Dlink next) {
		this.next = next;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
