import java.util.Scanner;

public class fibonnacci {
public static void main(String[] args) {
	System.out.println("enter the no up to which:");
	Scanner in =new Scanner(System.in);
	int b=in.nextInt();
	for(int i=0;i<=b;i++){
	
	System.out.print(fib(i));
	}
}
static int fib(int n){
	if(n==0){
		return 0;
	}
	else if(n==1){
		return 1;
	}
	else
		return fib(n-1)+fib(n-2);
	
}
}
