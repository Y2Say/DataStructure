package tree;

/**
 * 叶结点与权值对
 * 
 * @author user
 *
 */
public class LettFreq {
	private char lett;// 叶结点
	private int freq;// 权值

	public LettFreq(int f, char l) {
		freq = f;
		lett = l;
	}

	public LettFreq(int f) {
		freq = f;
	}

	public int weight() {
		return freq;// 返回权值
	}

	public char letter() {
		return lett;// 返回叶结点
	}
}
