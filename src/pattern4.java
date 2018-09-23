import java.util.Scanner;

/*
 
 3
 44           // when
 555         // N=4 ,start=3
 6666
 6666
 555
 44
 3
 
 */
public class pattern4 {
public static void main(String[] args) {
	System.out.println("ENTER VALUES OF N AND START");
	Scanner input1=new Scanner(System.in);
	
	int N=input1.nextInt();
	int start=input1.nextInt();
	pattern(N, start);
}
static void pattern(int N ,int start){
	for(int i=1;i<=N;i++){
		start++;
		for(int j=1;j<=i;j++){
			System.out.print(start-1);
		}
		System.out.println();
	}
	for(int k=N;k>=1;k--){
		start--;
		for(int j=1;j<=k;j++){
			System.out.print(start);
		}
		System.out.println();
	}
}
}

