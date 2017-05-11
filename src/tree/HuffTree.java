package tree;

/**
 * ������������
 * 
 * @author user
 *
 */
public class HuffTree {
	private BinNode root;// �����������������

	public HuffTree(LettFreq val) {
		root = new BinNodePtr(val);
	}

	public HuffTree(LettFreq val, HuffTree l, HuffTree r) {
		root = new BinNodePtr(val, l.root(), r.root());
	}

	public BinNode root() {
		return root;
	}

	// ������Ȩֵ��������Ȩֵ
	public int weight() {
		return ((LettFreq) root.element()).weight();
	}
}
