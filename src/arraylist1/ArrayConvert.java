package arraylist1;

public class ArrayConvert {
	public static void main(String[] args) {
		int[][] data = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 3, 4, 5, 6 }, { 6, 7, 8, 9 }, { 2, 6, 9, 4 } };
		int[] rowdata = new int[20];// �����洢����Ϊ�����������ά����
		int[] coldata = new int[20];// �����洢����Ϊ�����������ά����
		int i, j;
		System.out.println("�����ά���飺");
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4; j++)
				System.out.print(data[i][j] + " ");
			System.out.println();
		}
		// ����Ϊ����
		for (i = 0; i < 5; i++)
			for (j = 0; j < 4; j++)
				rowdata[i * 4 + j] = data[i][j];

		System.out.println();

		for (i = 0; i < rowdata.length; i++) {
			System.out.print(rowdata[i] + " ");
		}
		System.out.println();
		// ����Ϊ��
		for (i = 0; i < 5; i++)
			for (j = 0; j < 4; j++)
				coldata[j * 5 + i] = data[i][j];

		System.out.println();

		for (i = 0; i < coldata.length; i++) {
			System.out.print(coldata[i] + " ");
		}
		System.out.println();
	}

}
