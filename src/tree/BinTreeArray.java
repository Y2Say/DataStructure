package tree;

public class BinTreeArray {
	int MaxSize = 16;
	int[] treeData = new int[MaxSize];
	int[] rightNode = new int[MaxSize];
	int[] leftNode = new int[MaxSize];

	public BinTreeArray() {
		int i;// 循环变量
		for (i = 0; i < MaxSize; i++) {
			treeData[i] = 0;
			rightNode[i] = -1;
			leftNode[i] = -1;
		}
	}

	// 建立二叉树
	public void create(int data) {
		int i;
		int level = 0;// 树的层数
		int position = 0;
		for (i = 0; treeData[i] != 0; i++) {
			treeData[i] = data;
			// 寻找结点位置
			while (true) {
				// 判断是左子树还是右子树
				if (data > treeData[level]) {
					// 右子树是否有下一层
					if (rightNode[level] != -1)
						level = rightNode[level];
					else {
						position = -1;// 设置为右子树
						break;
					}
				} else {
					// 左子树是否有下一层
					if (leftNode[level] != -1)
						level = leftNode[level];
					else {
						position = 1;// 设置为左子树
						break;
					}
				}
			}
			if (position == 1)// 建立节点的左右连接
				leftNode[level] = i;// 连接左子树
			else
				rightNode[level] = i;// 连接右子树
		}
	}

	// 打印所有二叉树结点值
	public void printAll() {
		int i;
		System.out.println("二叉树结点值：");
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
	// 以数组方式实现二叉树
	/*
	 * int[] ABinTree = new int[16];
	 * 
	 * public BinTreeArray(){ for(int i=0;i<ABinTree.length;i++){ ABinTree[i]=0;
	 * } } //建立二叉树 public void create(int data){ int level=1;//树的层数,从层1开始建立
	 * //判断是否存在子树 while(ABinTree[level]!=0){ //判断是左子树还是右子树
	 * if(data<ABinTree[level]) level=level*2;//左子树 else level=level*2+1;//右子树 }
	 * ABinTree[level]=data;//将元素值插入结点 } //输出二叉树结点值 public void printAll(){
	 * System.out.println("二叉树结点值依次是："); for(int i=1;i<ABinTree.length;i++){
	 * System.out.print("Node"+i); System.out.println(":["+ABinTree[i]+"]"); } }
	 */

}
