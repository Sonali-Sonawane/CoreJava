package programs;

public class MultiDimentional {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[2][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		 int count = 0;
		 for (int i = 0; i<arr.length; i++)
			 for(int j=0; j<arr[i].length; j++)
				 arr[i][j] = count++;
		 System.out.println("Content of 2D jagged array");
		 for(int i =0; i<arr.length; i++)
		 {
			 for (int j=0; j<arr[i].length; j++)
				 System.out.print(arr[i][j]+" ");
			 System.out.println();
		 }
	}

}


