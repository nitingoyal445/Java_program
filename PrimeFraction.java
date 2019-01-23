//(19)
import java.util.Scanner;
public class PrimeFraction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter Number for Prime Fraction");
		num=sc.nextInt();
		for(int i=2;i<=num;i++) {
			while(num%i==0) {
				System.out.print(i+" ");
				num/=i;
			}
		}

	}

}
