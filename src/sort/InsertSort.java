package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * ֱ�Ӳ�������
 * @author user
 *
 */
public class InsertSort {
	public static int[] data = new int[10];// ��������

	public static void main(String[] args) {
		int i;// ѭ������
		int index;// �����±����
		System.out.println("������һ��ֵ��");
		index = 0;
		// ��ȡ�������ݴ���������
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		StringTokenizer st;
		// ��ȡ����ֵ
		do {
			System.out.println("data" + index + ":");
			try {
				String myline = br.readLine();
				st = new StringTokenizer(myline);
				data[index] = Integer.parseInt(st.nextToken());// ��ȡ����ֵ
			} catch (IOException e) {
				System.out.println("IO error:" + e);
			}
			index++;
		} while (data[index - 1] != 0);
		// ����ǰ��������
		System.out.println("����ǰ��");
		for (i = 0; i < index - 1; i++) {
			System.out.print(" " + data[i] + " ");
			System.out.println("");
			insertSort(index - 1);// ��������
			// �������
			System.out.println("�����");
			for (i = 0; i < index - 1; i++) {
				System.out.print(" " + data[i] + " ");
				System.out.println("");
			}
		}
	}

	public static void insertSort(int index) {
		int i, j, k;// ѭ������
		int indexNode;// �����������
		for (i = 1; i < index; i++) {
			indexNode = data[i];
			j = i - 1;
			// ���ʵ��Ĳ���λ��
			while (j > 0 && indexNode < data[j]) {
				data[j + 1] = data[j];
				j--;
			}
			// ����ֵ����
			data[j + 1] = indexNode;
			System.out.println("");
			for (k = 0; k < index; k++) {
				System.out.print(" " + data[k] + " ");
				System.out.println("");
			}
		}
	}

}
