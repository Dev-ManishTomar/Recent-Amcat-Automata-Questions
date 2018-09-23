/*
	1
	123
	12345
	1234567
	123456789
	1234567
	12345
	123
	1
 */
public class pattern2 {
public static void main(String[] args) {
	
	for(int i=1;i<=5;i++){
		int k=1;
		for(int j=1;j<=(2*i)-1;j++){
			System.out.print(k++);
			
		}System.out.println();
	}
	for(int i=4;i>=1;i--){
		int p=1;
		for(int j=1;j<=(2*i)-1;j++){
			System.out.print(p++);
		}
		System.out.println();
	}
	
}
}
