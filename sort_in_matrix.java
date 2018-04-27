package learn_for_java;
import java.util.Arrays;

public class sort_in_matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]matrix=new int[5][8];
		
		for(int i=0;i<5;++i){
			for(int j=0;j<8;++j){
				matrix[i][j]=(int) (Math.random()*100);
			}
		}
		
		
		for(int i=0;i<5;i++){
			String content=Arrays.toString(matrix[i]);
			System.out.println(content);
			
		}
		
		for(int i=0;i<5;i++){
			int[]temp=Arrays.copyOfRange(matrix[i], 0, 8);
			Arrays.sort(matrix[i]);
			
		}
		System.out.println("************");
		
		for(int i=0;i<5;i++){
			String content=Arrays.toString(matrix[i]);
			System.out.println(content);
			
		}
	}

}
