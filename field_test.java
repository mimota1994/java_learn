package learn_for_java;

public class field_test {
	
	int i=1;
	
	int test(int i){
		i=i+1;
		return i;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		field_test ii=new field_test();
		System.out.println(ii.test(7));

	}

}
