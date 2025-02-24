package package1;


public class MyMath {


	public int mod(int x, int y){
		int r=0;
		
		if (y>x){
			r=x;
			while (r<0){
					r += y;
			}
			
//		if (y<x){
//			r=x;
//			while (r<0){
//				r+=y;
//					
//			}
//			r=-r;
//				
//		}
//			

	}
		return r;
	}
	
	
	public static int matricesAddition(int[][] x, int[][]y){
		int[][] r = new int[3][3];

		int i=0;
		int j=0;
			
		for (i=0; i<3; i++){
			for (j=0; j<3; j++){
				r[i][j] = x[i][j] + y[i][j] ;
				
			}
		}

		
		for (i=0; i<3; i++){
			for (j=0; j<3; j++){
				System.out.println(r[i][j]);
				
			}
		
		}
		return r[i][j];
		
		
		
	
	
		
	}

	
}	
	
	
