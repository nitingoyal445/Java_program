//(3)
import java.util.Scanner;
public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter String to remove duplicate words");
		str=sc.nextLine();
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			if(words[i]!=null) {
				for(int j=i+1;j<words.length;j++) {
					if(words[i].equals(words[j])) {
						words[j]=null;
					}
				}
			}
		}
		for(int i=0;i<words.length;i++) {
			if(words[i]!=null) {
				System.out.print(words[i]);
				System.out.print(" ");
			}
		}

	}

}
