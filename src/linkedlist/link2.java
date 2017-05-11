package linkedlist;

public class link2 {
	private Link head;
	private Link tail;
	
	protected Link curr;
	link2(int sz){
		setup();
	}
	link2(){
		setup();
	}
	private void setup(){
		tail=head=curr=new Link(null);
	}
	/*public static void main(String[] args){
		int dataname=0;
		while(true){
			dataname++;
			System.out.println("请输入：");
		}
	}*/
	
	//插入一个元素
	public void insert(Object data){
		if(curr==null){
			System.out.println("no element");
			return;
		}
		curr.setNext(new Link(data,curr.next()));
		if(tail==curr){
			tail=curr.next;
		}
	}
	public void append(Object data){
		tail.setNext(new Link(data,null));
		tail=tail.next;
	}
}
