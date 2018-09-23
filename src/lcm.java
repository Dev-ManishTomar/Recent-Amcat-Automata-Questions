
public class lcm {
public static void main(String[] args) {
	int a=25;
	int b=15;
	System.out.println(lcm(a, b));
}
static int gcd(int a,int b){
	if(a==0||b==0){
		return 0;
	}
	if(a==b){
		return a;
	}
	if(a>b){
		return gcd(a-b, b); // passing values accordingly 
	}
	else
	return gcd(a, b-a); // passing values accordingly
}
static int lcm(int a, int b){
	return(a*b)/gcd(a, b);
}
}
