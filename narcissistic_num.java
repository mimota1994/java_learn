package learn_for_java;

public class narcissistic_num {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=100;i<1000;i++){
			int unit=i%10;
			int decade=i%100/10;
			int hundred=i/100;
			if((unit*unit*unit+decade*decade*decade+hundred*hundred*hundred)==i)
				System.out.println(i);
		}

	}

}
