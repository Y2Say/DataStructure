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
	//���ô�С
	Squene(int sz){
		setup(sz);
	}
	//��ʼ��
	void setup(int sz){
		size=sz+1;
		front=rear=0;
		listarray=new Object[sz+1];
	}
	//�������
	public void clear(){
		front=rear=0;
	}
	//���һ��Ԫ��
	public void enquene(Object data){
		if(((rear+1)%size)==front){
			System.out.println("quene is full");
			return;
		}
		rear=(rear+1)%size;
		listarray[rear]=data;
	}
	//����һ��Ԫ��
	public Object dequene(){
		if(isEmpty()){
			System.out.println("quene id empty");
			return null;
		}
		front=(front+1)%size;
		return listarray[front];
	}
	//ȡ����Ԫ��
	public Object firstvalue(){
		if(isEmpty()){
			System.out.println("quene is empty");
			return null;
		}
		return listarray[(front+1)%size];
	}
	//�ж��Ƿ�Ϊ��
	public boolean isEmpty(){
		return front==rear;
	}
}
