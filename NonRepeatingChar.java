//(9)
import java.util.Scanner;
public class NonRepeatingChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str;
		str=sc.nextLine();
		char[] res=str.toCharArray();
		int i;
		int j;
		for(i=0;i<=1;i++) {
			for(j=i+1;j<res.length;j++) {
				if(res[i]!=res[j]) {
					System.out.println(res[j]);
					break;
				}
			
			}
		break;
		}

	}

}
