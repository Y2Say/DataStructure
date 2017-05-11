package tree;

public class BinTreeArray {
	int MaxSize = 16;
	int[] treeData = new int[MaxSize];
	int[] rightNode = new int[MaxSize];
	int[] leftNode = new int[MaxSize];

	public BinTreeArray() {
		int i;// ѭ������
		for (i = 0; i < MaxSize; i++) {
			treeData[i] = 0;
			rightNode[i] = -1;
			leftNode[i] = -1;
		}
	}

	// ����������
	public void create(int data) {
		int i;
		int level = 0;// ���Ĳ���
		int position = 0;
		for (i = 0; treeData[i] != 0; i++) {
			treeData[i] = data;
			// Ѱ�ҽ��λ��
			while (true) {
				// �ж�������������������
				if (data > treeData[level]) {
					// �������Ƿ�����һ��
					if (rightNode[level] != -1)
						level = rightNode[level];
					else {
						position = -1;// ����Ϊ������
						break;
					}
				} else {
					// �������Ƿ�����һ��
					if (leftNode[level] != -1)
						level = leftNode[level];
					else {
						position = 1;// ����Ϊ������
						break;
					}
				}
			}
			if (position == 1)// �����ڵ����������
				leftNode[level] = i;// ����������
			else
				rightNode[level] = i;// ����������
		}
	}

	// ��ӡ���ж��������ֵ
	public void printAll() {
		int i;
		System.out.println("���������ֵ��");
		System.out.println("[lchild] [data] [rchild]");
		for (i = 0; i < MaxSize; i++) {
			if (treeData[i] != 0) {
				System.out.print("Node" + i);
				System.out.println("[" + leftNode[i] + "]");
				System.out.println("[" + treeData[i] + "]");
				System.out.println("[" + rightNode[i] + "]");
			}
		}
	}
	// �����鷽ʽʵ�ֶ�����
	/*
	 * int[] ABinTree = new int[16];
	 * 
	 * public BinTreeArray(){ for(int i=0;i<ABinTree.length;i++){ ABinTree[i]=0;
	 * } } //���������� public void create(int data){ int level=1;//���Ĳ���,�Ӳ�1��ʼ����
	 * //�ж��Ƿ�������� while(ABinTree[level]!=0){ //�ж�������������������
	 * if(data<ABinTree[level]) level=level*2;//������ else level=level*2+1;//������ }
	 * ABinTree[level]=data;//��Ԫ��ֵ������ } //������������ֵ public void printAll(){
	 * System.out.println("���������ֵ�����ǣ�"); for(int i=1;i<ABinTree.length;i++){
	 * System.out.print("Node"+i); System.out.println(":["+ABinTree[i]+"]"); } }
	 */

}
