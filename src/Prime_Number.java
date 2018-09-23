import java.util.Scanner;

public class Prime_Number {
public static void main(String[] args) {

	
	System.out.println("Enter the Number");
	Scanner input=new Scanner(System.in);
			int n = input.nextInt();
			for(int i=2;i<=n;i++){
				if(Is_prime(i)==1)
					System.out.println(i);
			}
	
}
static int Is_prime(int num){
	int counter=0;
	for(int i=1;i<=num;i++){
		if(num%i==0)
			counter++;
		
	}
	if(counter==2){
		return 1;
	}
	else
		return 0;
	
}
}
