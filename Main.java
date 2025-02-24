package package1;


public class Main {

	public static void main(String[] args){
		MyMath obj = new MyMath();
		int res = (int) obj.mod(-10, 4);
		//System.out.println(res);
		
		
		int[][]x = new int[3][3];
		int[][]y = new int[3][3];
		
		
		obj.matricesAddition(x,y);
		
	}

}