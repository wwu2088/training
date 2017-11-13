package basics;

public class functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	static int sum(int n) {
		if(n == 1)
			return 1;
		return n+ sum(n-1);
	}
	
	static int fact(int n) {
		if(n == 0 || n == 1)
			return 1;
		return n * fact(n-1);
	}
	
	static int min(int[] a) {
		int result = a[0];
		for(int i = 1; i < a.length; i++)
			if(a[i] < result)
				result = a[i];
		return result;
	}
	
	static int max(int[] a) {
		int result = a[0];
		for(int i = 1; i < a.length; i++)
			if(a[i] > result)
				result = a[i];
		return result;
	}
	
	static int ave(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++)
			sum+=a[i];
		return sum/a.length;
	}
}
