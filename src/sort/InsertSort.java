package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 直接插入排序
 * @author user
 *
 */
public class InsertSort {
	public static int[] data = new int[10];// 数据数组

	public static void main(String[] args) {
		int i;// 循环变量
		int index;// 数组下标变量
		System.out.println("请输入一个值：");
		index = 0;
		// 读取输入数据存入数组中
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		StringTokenizer st;
		// 读取数据值
		do {
			System.out.println("data" + index + ":");
			try {
				String myline = br.readLine();
				st = new StringTokenizer(myline);
				data[index] = Integer.parseInt(st.nextToken());// 读取输入值
			} catch (IOException e) {
				System.out.println("IO error:" + e);
			}
			index++;
		} while (data[index - 1] != 0);
		// 排序前数据内容
		System.out.println("排序前：");
		for (i = 0; i < index - 1; i++) {
			System.out.print(" " + data[i] + " ");
			System.out.println("");
			insertSort(index - 1);// 插入排序
			// 排序后结果
			System.out.println("排序后：");
			for (i = 0; i < index - 1; i++) {
				System.out.print(" " + data[i] + " ");
				System.out.println("");
			}
		}
	}

	public static void insertSort(int index) {
		int i, j, k;// 循环变量
		int indexNode;// 欲插入的数据
		for (i = 1; i < index; i++) {
			indexNode = data[i];
			j = i - 1;
			// 找适当的插入位置
			while (j > 0 && indexNode < data[j]) {
				data[j + 1] = data[j];
				j--;
			}
			// 将数值插入
			data[j + 1] = indexNode;
			System.out.println("");
			for (k = 0; k < index; k++) {
				System.out.print(" " + data[k] + " ");
				System.out.println("");
			}
		}
	}

}
