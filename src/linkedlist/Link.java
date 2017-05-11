package linkedlist;

public class Link {
	Link next;
	Object data;

	public Link(Object data) {
		this.data = data;
	}

	public Link(Object data,Link next) {
		this.next = next;
		this.data = data;
	}

	public Link next(){
		return next;
	}
	public Object data(){
		return data;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public void setData(Object data) {
		this.data = data;
	}
	

}
