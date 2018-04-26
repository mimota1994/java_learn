package learn_for_java;

public class millionaire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double money=12000;
		int year=1;
		double sum=0;
		while(true){
//			今年的第一笔钱的收入
			money=money*1.2;
			sum=sum+money;
			if(sum>=1000000){
				System.out.println(year);
				System.out.println(sum);
				break;
			}	
			year+=1;
			
		}

	}

}
