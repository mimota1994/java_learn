package learn_for_java;
import java.util.Scanner;

public class BMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
//		身高
		System.out.println("请输入身高(m):");
		float height=s.nextFloat();
		
		
//		体重
		System.out.println("请输入体重(kg):");
		float weight=s.nextFloat();
		
		float bmi=weight/(height*height);
		
		System.out.println("当前的BMI是:"+bmi);
		
	}

}
