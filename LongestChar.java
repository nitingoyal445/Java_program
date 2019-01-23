//(20)
import java.util.Scanner;
public class LongestChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		int l=0;
		int m=0;
		int count=0;
		System.out.println("Enter String");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j))
					count++;
				else
					break;
			}
			if(count>m) {
				m=count;
				l=i;
			}
			count=0;
		}
		
System.out.println("Longest sequence is "+m+" at index "+l+ " character is "+str.charAt(l));
	}

}
