package tree;

/**
 * Ҷ�����Ȩֵ��
 * 
 * @author user
 *
 */
public class LettFreq {
	private char lett;// Ҷ���
	private int freq;// Ȩֵ

	public LettFreq(int f, char l) {
		freq = f;
		lett = l;
	}

	public LettFreq(int f) {
		freq = f;
	}

	public int weight() {
		return freq;// ����Ȩֵ
	}

	public char letter() {
		return lett;// ����Ҷ���
	}
}
