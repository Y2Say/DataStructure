package tree;

/**
 * 哈夫曼编码树
 * 
 * @author user
 *
 */
public class HuffTree {
	private BinNode root;// 哈夫曼编码树根结点

	public HuffTree(LettFreq val) {
		root = new BinNodePtr(val);
	}

	public HuffTree(LettFreq val, HuffTree l, HuffTree r) {
		root = new BinNodePtr(val, l.root(), r.root());
	}

	public BinNode root() {
		return root;
	}

	// 根结点的权值即是树的权值
	public int weight() {
		return ((LettFreq) root.element()).weight();
	}
}
