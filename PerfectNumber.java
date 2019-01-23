
public class PerfectNumber {

	public static void main(String[] args) {
		int sum=0;
		int i,j;
		System.out.println("Perfect No. from 1 to 100");
		for(i=1;i<100;i++) {
			sum=1;
			for( j=2;j<i;j++) {
				if(i%j==0)
					sum=sum+j;
			}
			if(i==sum) {
				System.out.print(i+" ");
			}
		}

	}

}
