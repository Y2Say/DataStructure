package tree;
/**
 * �������ڵ�ĳ�����������
 * @author user
 *
 */
public interface BinNode {
	//���ز�����Ԫ��ֵ
	public Object element();
	public Object setElement(Object v);
	
	//���ز���������
	public BinNode left();
	public BinNode setLeft(BinNode p);
	
	//���ز������Һ���
	public BinNode right();
	public BinNode setRight(BinNode p);
	
	//�ж��Ƿ�ΪҶ���
	public boolean isLeaf();
	
}
