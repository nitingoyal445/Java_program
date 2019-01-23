//(2)
public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="The quick brown fox jumps over the lazy dog";
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
		else
			System.out.println("Not Panagram");
		
	}

}
