//(15) 
import java.util.Scanner;
public class StringNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check");
		int n=sc.nextInt();
		int k,l,m;
		int sum=0;
		int save_n=n;
		while(n!=0) {
			k=1;
			l=1;
			m=n%10;
			while(k<=m) {
			l=l*k;
			k++;
				
			}
			sum=sum+l;
			n=n/10;
		}
		if(sum==save_n) {
			System.out.println("Strong Number");
		}
		else
			System.out.println("Not");
			
	}

}

