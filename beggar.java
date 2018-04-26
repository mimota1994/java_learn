package learn_for_java;

public class beggar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money=1;
		int sum=0;
		for(int i=0;i<10;i++){
			sum=sum+money;
			money=money<<1;
		}
		
		System.out.println("10天的收入为:"+sum);

	}

}
