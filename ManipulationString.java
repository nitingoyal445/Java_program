import java.util.Scanner;
public class ManipulationString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str;
		int count=0;
		int i,j;
		str=sc.nextLine();
		for( i=0;i<str.length();i++) {
			for( j=i;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
				else
					break;
			}
			System.out.println(str.charAt(i)+" = "+ count);
			count=0;
			i=j-1;
		}

	}

}
