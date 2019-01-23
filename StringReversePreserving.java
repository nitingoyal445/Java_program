//(6)
import java.util.Scanner;
public class StringReversePreserving {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter String");
		str=sc.nextLine();
		char[] input=str.toCharArray();
		char[] res=new char[input.length];
		
		for(int i=0;i<input.length;i++) {
			if(input[i]==' ') {
				res[i]=' ';
			}
		}
		int j=input.length-1;
		for(int i=0;i<input.length;i++) {
			if(input[i]!=' ') {
				if(res[j]==' ')
					j--;
				res[j]=input[i];
				j--;
			}
		}
		System.out.println(String.valueOf(res));

	}

}
