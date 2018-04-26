package learn_for_java;

public class golden_point {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double judge;
		double min_dis=1;
		int min_i=0;
		int min_j=0;
		
		for(int i=1;i<=20;i++){
			for(int j=1;j<=20;j++){
				if(i%2==0&j%2==0)
					continue;
				
				judge=(i+0.0)/j-0.618;
				if(judge<0)
					judge=-judge;
				
				if(judge<min_dis){
					min_dis=judge;
					min_i=i;
					min_j=j;
				}
			}
		}
		
		System.out.println("离黄金分割点（0.618）最近的两个数相除是:"+min_i+"/"+min_j+"="+(min_i+0.0)/min_j);

	}

}
