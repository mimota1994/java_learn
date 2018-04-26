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
		
		if(bmi<18.4)
			System.out.println("身体状态是:体重过轻");
		else if(18.5<=bmi&bmi<24)
			System.out.println("身体状态是:正常范围");
		else if(24<=bmi&bmi<27)
			System.out.println("身体状态是:体重过重");
		else if(27<=bmi&bmi<30)
			System.out.println("身体状态是:轻度肥胖");
		else if(30<=bmi&bmi<35)
			System.out.println("身体状态是:中度肥胖");
		else
			System.out.println("身体状态是:重度肥胖");
		
		
	}

}
