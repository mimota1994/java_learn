package learn_for_java;

public class enhanced_for {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] value=new int[]{18,62,68,82,65,9};
		
		int min=value[0];
		
		for(int each:value){
			if (each<min)
				min=each;
		}
		
		System.out.println(min);
	}

}
