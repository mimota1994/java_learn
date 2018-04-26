package learn_for_java;
import java.util.Scanner;

public class relation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("第一个整数:");
		float a=s.nextFloat();
		
		System.out.println("第二个整数:");
		float b=s.nextFloat();
		
		System.out.println("比较"+a+">"+b+":"+(a>b));
		System.out.println("比较"+a+">="+b+":"+(a>=b));
		System.out.println("比较"+a+"<"+b+":"+(a<b));
		System.out.println("比较"+a+"<="+b+":"+(a<=b));
		System.out.println("比较"+a+"=="+b+":"+(a==b));
		System.out.println("比较"+a+"!="+b+":"+(a!=b));
		
		

	}

}
