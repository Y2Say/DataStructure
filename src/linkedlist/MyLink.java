package linkedlist;

public class MyLink {
	Link head=null;
	Link tail=null;
	public void add(Object data) {
		Link newlink = new Link(data);
		if (head == null) {
			head = newlink;
			return;
		}

		Link link = head;
		while (link.next != null) {
			link = link.next;
		}
		link.next = newlink;
	}
	/**
	 * ���ҵ�i��Ԫ��
	 * @return
	 */
	
	public int nexti(int i){
		int j=0;
		Link link=head;
		while((j!=i)&&(link!=null)){
			j++;
			link=link.next;
		}
		if(link==null)
			return (0);
		else
			return j;
	}
	//������
	public int length() {
		int length = 0;
		Link link = head;
		while (link != null) {
			
			link = link.next;
			length++;
		}
		return length;
	}
	//ɾ������Ϊindex��Ԫ��
	public boolean delete(int index) {
		if (index < 1 || index > length()) {
			return false;
		}
		if (index == 1) {
			head = head.next;
			return true;
		}
		int i = 1;
		Link preNode = head;
		Link curNode = preNode.next;
		while (curNode != null) {
			if (i == index) {
				preNode.next = curNode.next;
				return true;
			}
			preNode = curNode;
			curNode = curNode.next;
			i++;
		}
		return false;
	}
	//��ӡ����
	public void printlink(){
		Link link = head;
		while (link!= null) {
			System.out.println(link.data);
			link=link.next;
		}
	}
}
