package assignments;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		byte a;
		short b;
		int c;
		long d;
		double e;
		float f;
		
		
		Scanner s=new Scanner(System.in);
		a=s.nextByte();
		b=s.nextShort();
		c=a+b;
		System.out.println("sum of byte and short is:"+c);
		
		d=b+c;
		System.out.println("Sum of short and int is:"+d);
		
		e=c+d;
		System.out.println("sum of int and long is:"+e);
		
		f=(float)(d+e);
		System.out.println("sum of long and double is:" +f);
		
		
		
		
		

	}

}
