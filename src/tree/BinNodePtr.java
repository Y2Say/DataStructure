package tree;

public class BinNodePtr implements BinNode {
	private Object element;
	private BinNode left;
	private BinNode right;

	public BinNodePtr() {
		left = right = null;
	}

	public BinNodePtr(Object val) {
		left = right = null;
		element = val;
	}

	public BinNodePtr(Object val, BinNode l, BinNode r) {
		element = val;
		left = l;
		right = r;
	}

	public Object element() {

		return element;
	}

	public Object setElement(Object v) {
		return element = v;
	}

	public BinNode left() {
		return left;
	}

	public BinNode setLeft(BinNode p) {

		return left = p;
	}

	public BinNode right() {

		return right;
	}

	public BinNode setRight(BinNode p) {

		return right = p;
	}

	public boolean isLeaf() {

		return (left==null)&&(right==null);
	}

}
