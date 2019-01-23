//(4)
import java.util.Scanner;
public class StringWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.nextLine();
		int[] alphabetList=new int[26];
		int index=0;
		int weight=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)>='A' && st.charAt(i)<='Z') {
				index=st.charAt(i)-'A'+1;
			}
			if(st.charAt(i)>='a' && st.charAt(i)<='z') {
				index=st.charAt(i)-'a'+1;
			}
			weight=weight+index;
		}
		System.out.println(st);
		System.out.println("Weight is "+ weight);
		
	}

}
