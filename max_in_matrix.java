package learn_for_java;

public class max_in_matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]matrix=new int[5][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				matrix[i][j]=(int) (Math.random()*100);
			}
		}
		
		int max=matrix[0][0];
		int max_i=0;
		int max_j=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(matrix[i][j]>max){
					max=matrix[i][j];
					max_i=i;
					max_j=j;
				}
			}
		}
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(matrix[i][j]>10)
					System.out.print(matrix[i][j]+"  ");
				else
					System.out.print(matrix[i][j]+"   ");
				if((j+1)%5==0)
					System.out.println();
			}
		}
		
		System.out.println("找出来最大的是:"+max);
		System.out.println("其坐标是["+max_i+"]["+max_j+"]");
		
		
	}

}
