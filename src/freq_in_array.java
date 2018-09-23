
public class freq_in_array {
	public static void main(String[] args) {
		int array[]={1,2,1,1,3,8,9,7,5,4,4,5,5,3,3,3,3,3};
		
		for(int i=1;i<=9;i++){
			
			System.out.println(i+"="+freq(array, i));
		}
	}
static int freq(int a[],int num){
	int counter=0;
	for(int i=0;i<=a.length-1;i++){
		if(a[i]==num){
			counter++;
		}
	
	}
	return counter;
	
}
}
