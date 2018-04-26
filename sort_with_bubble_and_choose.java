package learn_for_java;

public class sort_with_bubble_and_choose {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]b;
		b=new int[5];
		
		for(int i=0;i<5;i++){
			b[i]=(int)(Math.random()*100);
			System.out.print(b[i]+" ");
		}
		
		
//		choose
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				if(b[j]<b[i]){
					int temp=b[j];
					b[j]=b[i];
					b[i]=temp;
				}
			}
		}
		
		System.out.println();
		
		for(int i=0;i<5;i++){
			System.out.print(b[i]+" ");
		}
		
//		bubble
		int[]a;
		a=new int[5];
		
		System.out.println();
		
		for(int i=0;i<5;i++){
			a[i]=(int)(Math.random()*100);
			System.out.print(a[i]+" ");
		}
		
		
		for(int j=5;j>0;j--)
			for(int i=0;i<j-1;i++){
				if(a[i]>a[i+1]){
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		
		System.out.println();
		
		for(int i=0;i<5;i++){
			System.out.print(a[i]+" ");
		}
		
	}

}
