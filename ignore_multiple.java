package learn_for_java;

public class ignore_multiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<101;i++){
			if(i%3==0|i%5==0)
				continue;
			System.out.println(i);
		}

	}

}
