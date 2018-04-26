package learn_for_java;
import java.util.Scanner;

public class simple_add {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		实例化scanner类
		Scanner s=new Scanner(System.in);
		System.out.println("请输入第一个值:");
		float a=s.nextFloat();
		System.out.println("请输入第二个值:");
		float b=s.nextFloat();
		
		float c=a+b;
		System.out.println("两个数字的和为:"+c);
		
		

	}

}
