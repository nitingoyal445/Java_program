//(1)
import java.util.Scanner;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st word");
		String str1=sc.nextLine();
		System.out.println("Enter 2nd word");
		String str2=sc.nextLine();
		int l1=str1.length();
		int l2=str2.length();
		
		if(l1==l2)
		{
			char[] strar1=str1.toCharArray();
			char[] strar2=str2.toCharArray();
			Arrays.sort(strar1);
			Arrays.sort(strar2);
			String s1=new String(strar1);
			String s2=new String(strar2);
			if(s1.equals(s2)) {
				System.out.println("Anagram");
			}
			else
				System.out.println("Not Anagram");
		
		}
		else
			System.out.println("Not Anagram");
	}

}
