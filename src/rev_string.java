
public class rev_string {
	public static void main(String[] args) {
		String str="geeksofgeeks";
		/*char array[]=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(array[i]);
		}*/
		
		StringBuffer input=new StringBuffer();
		input.append(str);
		input=input.reverse();
		System.out.println(input);
	}

}
