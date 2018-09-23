
public class sum_of_num {
	public static void main(String[] args) {
		int num=1554;
		int sum=0;
		while(num>0){
			int r=num%10;
			num=num/10;
			sum=sum+r;
					
		}
		System.out.println(sum);
	}

}
