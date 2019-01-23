//(5)
import java.util.Scanner;
public class StringWithS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of String Array");
		int s;
		s=sc.nextInt();
		String[] str=new String[s];
		for(int i=0;i<s;i++) {
			str[i]=sc.nextLine();
		}
		for(int i=0;i<s;i++) {
			if(str[i].startsWith("S")||str[i].startsWith("s")) {
				System.out.println(str[i]);
			}
		}

	}

}
