package quene;

public class Squene {
	private static final int defaulesize=10;
	private int size;
	private int front;
	private int rear;
	private Object[] listarray;
	
	Squene(){
		setup(defaulesize);
	}
	//设置大小
	Squene(int sz){
		setup(sz);
	}
	//初始化
	void setup(int sz){
		size=sz+1;
		front=rear=0;
		listarray=new Object[sz+1];
	}
	//队列清空
	public void clear(){
		front=rear=0;
	}
	//入队一个元素
	public void enquene(Object data){
		if(((rear+1)%size)==front){
			System.out.println("quene is full");
			return;
		}
		rear=(rear+1)%size;
		listarray[rear]=data;
	}
	//出队一个元素
	public Object dequene(){
		if(isEmpty()){
			System.out.println("quene id empty");
			return null;
		}
		front=(front+1)%size;
		return listarray[front];
	}
	//取队首元素
	public Object firstvalue(){
		if(isEmpty()){
			System.out.println("quene is empty");
			return null;
		}
		return listarray[(front+1)%size];
	}
	//判断是否为空
	public boolean isEmpty(){
		return front==rear;
	}
}
