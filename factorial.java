package learn_for_java;
import java.util.Scanner;

public class factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("请输入一个整数");
		
		int fac=s.nextInt();
		
		int temp=fac;
		
		int sum=1;
		
		while(temp!=1){
			sum=temp*sum;
			temp-=1;
		}
		
		System.out.println(fac+"的阶乘为"+sum);

	}

}
