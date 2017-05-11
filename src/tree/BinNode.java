package tree;
/**
 * 二叉树节点的抽象数据类型
 * @author user
 *
 */
public interface BinNode {
	//返回并设置元素值
	public Object element();
	public Object setElement(Object v);
	
	//返回并设置左孩子
	public BinNode left();
	public BinNode setLeft(BinNode p);
	
	//返回并设置右孩子
	public BinNode right();
	public BinNode setRight(BinNode p);
	
	//判断是否为叶结点
	public boolean isLeaf();
	
}
