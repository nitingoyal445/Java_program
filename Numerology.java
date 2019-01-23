//(17)
import java.util.Scanner;
public class Numerology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=0,index=0,sum=0;
		int[] arr= {1,2,3,4,5,8,3,5,1,1,2,3,4,5,7,8,1,2,3,4,6,6,6,5,1,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=91) {
				index=str.charAt(i)-'A';
				value=arr[index];
				sum=sum+value;
			}
		}
		int nsum=0;
		int rem=0;
		if(sum>10) {
			while(sum>0) {
				rem=sum%10;
				nsum=nsum+rem;
				sum/=10;
			}
		}
		System.out.println(str);
		System.out.println("Numerology Number is "+nsum);
		
	}

}
