/*
 55555
 54444
 54333
 54322
 54321
 */
public class pattern5 {
public static void main(String[] args) {
	
	for(int i=1;i<=5;i++){
		int k=5;
		for(int j=1;j<=5;j++){
			if(i==1){
				System.out.print(k);
			}
			else if(j<i){
				System.out.print(k--);
			}
			else{
				System.out.print(k);
			}
		}
		System.out.println();
	}
}
}
