import java.util.*;
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenght of triangle");
		int a=sc.nextInt();
		int i;
		System.out.println("1");
		double j;
		for(i=2;i<=a;i++) {
			j=Math.pow(11,i);
			System.out.println((int)j);
		}
		System.out.println("Enter Coordinates");
		int x=sc.nextInt();
		int y=sc.nextInt();
		double o= Math.pow(11,x);
		int p=(int)o;
		int v=p;
		for(i=1;i<=y;i++) {
			x=v%10;
			v=v/10;
		}
		System.out.println(x);
	}

}
