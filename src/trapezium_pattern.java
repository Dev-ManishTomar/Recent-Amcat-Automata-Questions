/*1*2*3*4*17*18*19*20
    5*6*7*14*15*16
      8*9*12*13
        10*11
 */
public class trapezium_pattern {
public static void main(String[] args) {
	int count=0;
	int count2=0;
	for(int i=4;i>=1;i--){
		for(int p=4;p>i;p--)
			System.out.print(" ");
		
		for(int j=1;j<=i;j++)
			System.out.print(++count +"*");
		
		for(int l=1;l<=i;l++){
			System.out.print(++count2+i*i);
			if(l!=i) System.out.print("*");
		}
		
		System.out.println();
	}
	
}
}
