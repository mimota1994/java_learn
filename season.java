package learn_for_java;
import java.util.Scanner;

public class season {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("请输入月份");
		
		int season=s.nextInt();
		
		switch(season){
		case 1:
			
		case 2:
			
		case 3:
			System.out.println("春天");
			break;
		case 4:
			
		case 5:
			
		case 6:
			System.out.println("夏天");
			break;
		case 7:
			
		case 8:
			
		case 9:
			System.out.println("秋天");
			break;
		case 10:
			
		case 11:
			
		case 12:
			System.out.println("冬天");
			break;
		default:
			System.out.println("请输入正确的月份");
		
			
		}

	}

}
