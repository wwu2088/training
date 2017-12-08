package exceptionFiles;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cal(11,0);
		int a = 1;
		int b = 0;
		try {
			int c = a/b;
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
			System.out.println(e.toString());
		}
		System.out.println("Program is closing");
		
		String[] state = {"CA", "TX", "WC", "NY"};
		
		for(int i =0; i <= state.length; i++) {
			try {
				System.out.println(state[i]);
			}catch(ArrayIndexOutOfBoundsException r){
				System.out.println(r.toString());
			}
		}
	}
	
	public static double cal(int a, int b) {
		return cal2(a,b);
	}
	
	public static double cal2(int x, int y) {
		return x/y;
	}

}
