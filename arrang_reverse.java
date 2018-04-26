package learn_for_java;

public class arrang_reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a;
		a=new int[5];
		a[0]=(int)(Math.random()*100);
		a[1]=(int)(Math.random()*100);
		a[2]=(int)(Math.random()*100);
		a[3]=(int)(Math.random()*100);
		a[4]=(int)(Math.random()*100);
		for(int i=0;i<5;++i){
			System.out.print(a[i]+" ");
		}
		
//		反转
		int[]b;
		b=new int[5];
		
		for(int i=0;i<5;++i){
			b[i]=a[4-i];
		}
		
		a=b;
		System.out.println("\n********");
		for(int i=0;i<5;++i){
			System.out.print(a[i]+" ");
		}
		
	}

}
