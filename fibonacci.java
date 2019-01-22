//(7)
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int a=0;
		int b=1;
		int c;
		System.out.println("Enter index no.");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==1) {
			System.out.println(a);
		}
		else if(n==2) {
			System.out.println(a);
			System.out.println(b);
		}
		else {
			System.out.println(a);
			System.out.println(b);
			for(int i=2;i<n;i++) {
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}

	}

}
