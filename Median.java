//(28)
import java.util.Scanner;
import java.util.Arrays;
public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 1st array");
		int s1=sc.nextInt();
		int[] arr1=new int[s1];
		System.out.println("Enter values of 1st array");
		for(int i=0;i<s1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter size of 2nd array");
		int s2=sc.nextInt();
		int[] arr2=new int[s2];
		System.out.println("Enter values of 2nd array");
		for(int i=0;i<s2;i++) {
			arr2[i]=sc.nextInt();
		}
		int s3=s1+s2;
		int[] arr3=new int[s3];
		for(int i=0;i<s1;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=s1;i<s3;i++) {
			arr3[i]=arr2[i-s1];
		}
		Arrays.sort(arr3);
		for(int i=0;i<s3;i++) {
			System.out.print(arr3[i]);
		}
		if((s3%2)==0) {
			int n=(s3/2)-1;
			for(int i=1;i<=s3;i++) {
				System.out.println("");
				System.out.println(arr3[n]);
				break;
			}
		}
		if((s3%2)!=0) {
			int n=(s3/2);
			for(int i=1;i<=s3;i++) {
				System.out.println("");
				System.out.println(arr3[n]);
				break;
			}
		}
		
		
		
		
	}

}
