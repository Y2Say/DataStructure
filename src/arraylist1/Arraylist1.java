package arraylist1;

public class Arraylist1 {
	public static void main(String[] args) {
		int[] narray = { 1, 2, 3, 4, 6, 9, 12 };

		int i = 4;
		int item = 5;
		/*if (i > narray.length - 1 && i < 0) {
			System.out.println("i not exist");
		} else {
			for (int k = narray.length - 1; k <= i; k--) {
				narray[k + 1] = narray[k];
				narray[i] = item;	
			}
		}
		narray.length++;
		for (int j = 0; j < narray.length; j++) {
				System.out.print(narray[j] + " ");
			}
		*/	
		
		if(i>narray.length-1 && i<0)
		{
			System.out.println("i not exist");
		}
		else
		{
			if(narray.length==0)
				System.out.println("overflow");
			else
			{
				for(int k=i;k<narray.length-1;k++)
					narray[k]=narray[k+1];
			}

			for (int j = 0; j < narray.length-1; j++) {
				System.out.print(narray[j] + " ");
			}
		}
	}
}
