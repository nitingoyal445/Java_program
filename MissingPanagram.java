//(27)
import java.util.Scanner;
public class MissingPanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.nextLine();
		int[] alphabetList=new int[26];
		int index=0;
		int flag=1;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)>='A' && st.charAt(i)<='Z') {
				index=st.charAt(i)-'A';
			}
			if(st.charAt(i)>='a' && st.charAt(i)<='z') {
				index=st.charAt(i)-'a';
			}
			alphabetList[index]=1;
		}
		for(int i=0;i<26;i++) {
			if(alphabetList[i]!=1) {
				flag=0;
			}
		}
		System.out.println(st);
		if(flag==1) {
			System.out.println("Panagram");
		}
		else {
			System.out.println("Not Panagram");
			for(int i=0;i<26;i++) {
				if(alphabetList[i]!=1) {
					char ch=(char) (97+i);
					System.out.println(ch);
				}
			}
			
			
		}
	}

}
