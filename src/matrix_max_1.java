
public class matrix_max_1 {
	
	public static void main(String[] args) {
		
		int arr[][] = {
				{1, 1, 1, 1},
				{1, 0, 0, 0},
				{1, 1, 0, 1},
				{0, 0, 0, 0},
				}; 
		max_matrix(arr);
	}
	static void max_matrix(int arr[][]){
		 int rownum=0;
		int i = 0, j = 0, temp, count = 0;
		temp = count;
		for (i = 0; i <= 3; i++) {
			count=0;
		for (j = 0; j <= 3; j++) {
		if (arr[i][j] == 1) {
		count++;
		}
		if (count > temp) {
		temp = count;
		rownum = i;
		
	}
		
		}
		
}
		System.out.println(rownum);
		}}
