//(10)
import java.util.Scanner;
import java.lang.Math;
public class PowerOf10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check");
		int n=sc.nextInt();
		
		int a=1;
		int k=10;
		while(k<n) {
			k=10;
		k=(int) Math.pow(k,a);
		if(k==n) {
			System.out.println("yes");
			}
		else {
			a=a+1;
		}

	}
	if(k>n)
			System.out.println("No");

}}