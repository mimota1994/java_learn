package learn_for_java;

public class concat_array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1_num=(int) ((Math.random()+1)*5);
		int a2_num=(int) ((Math.random()+1)*5);
		int[]a1=new int[a1_num];
		int[]a2=new int[a2_num];
		
		for(int i=0;i<a1_num;++i){
			a1[i]=(int) (Math.random()*100);
		}
		
		for(int i=0;i<a2_num;++i){
			a2[i]=(int) (Math.random()*100);
		}
		
		int[]a3=new int[a1_num+a2_num];
		
		System.arraycopy(a1, 0, a3, 0, a1_num);
		System.arraycopy(a2, 0, a3, a1_num, a2_num);
		
		System.out.print("a1:");
		for(int i=0;i<a1_num;i++)
			System.out.print(a1[i]+" ");
		System.out.println();
		
		System.out.print("a2:");
		for(int i=0;i<a1_num;i++)
			System.out.print("  "+" ");
		
		for(int i=0;i<a2_num;i++)
			System.out.print(a2[i]+" ");
		System.out.println();
		
		System.out.print("a3:");
		for(int i=0;i<a1_num+a2_num;i++)
			System.out.print(a3[i]+" ");
		

	}

}
