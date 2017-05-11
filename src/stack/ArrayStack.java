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
	//初始化
	public void setup(int sz){
		size=sz;
		top=0;
		listarray=new Object[sz];
	}
	//堆栈清空
	public void clear(){
		top=0;
	}
	//栈顶压入元素
	public void push(Object data){
		if(data==null){
			System.out.println("data not exist!");
			return;
		}
		if(top>size){
			System.out.println("上溢");
			return;
		}
		listarray[top++]=data;
	}
	//弹出元素
	public Object pop(){
		if(!isempty()){
			return listarray[--top];
		}
		System.out.println("下溢");
		return null;
	}
	//取栈顶元素
	public Object topvalue(){
		if(!isempty()){
			return listarray[top-1];
		}
		System.out.println("下溢");
		return null;
	}
	//判断是否为空
	public boolean isempty(){
		return top==0;
	}

	public boolean Isoperator(char charAt) {
		// TODO Auto-generated method stub
		return false;
	}
}
