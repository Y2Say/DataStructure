package stack;

public class ArrayStack {
	private static final int defaultsize=10;
	private int size;
	private int top;
	private Object[] listarray;
	ArrayStack(){
		setup(defaultsize);
	}
	
	ArrayStack(int sz){
		setup(sz);
	}
	//��ʼ��
	public void setup(int sz){
		size=sz;
		top=0;
		listarray=new Object[sz];
	}
	//��ջ���
	public void clear(){
		top=0;
	}
	//ջ��ѹ��Ԫ��
	public void push(Object data){
		if(data==null){
			System.out.println("data not exist!");
			return;
		}
		if(top>size){
			System.out.println("����");
			return;
		}
		listarray[top++]=data;
	}
	//����Ԫ��
	public Object pop(){
		if(!isempty()){
			return listarray[--top];
		}
		System.out.println("����");
		return null;
	}
	//ȡջ��Ԫ��
	public Object topvalue(){
		if(!isempty()){
			return listarray[top-1];
		}
		System.out.println("����");
		return null;
	}
	//�ж��Ƿ�Ϊ��
	public boolean isempty(){
		return top==0;
	}

	public boolean Isoperator(char charAt) {
		// TODO Auto-generated method stub
		return false;
	}
}
