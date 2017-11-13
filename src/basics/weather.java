package basics;

public class weather {
	public static void main(String[] args) {
		int temp = 20;
		
		String sunC = "Sunny";
		
		if( temp > 80) {
			System.out.println(" It's pleasant. Wear shorts and t-shirt");
			
		}else if (temp > 60 && sunC == "Sunny"){
			System.out.println("It);s littl cooler. Perhaps wear a long-seeve shirt and jeans.");
			System.out.println("Wear a hat to keep the sun out of your eyes");
		}else if (temp > 50 || sunC == "Overcast"){
			System.out.println("Looks like a cold day, make sure to hear wearer clothes.");
		}else {
			System.out.println("Looks like a cold day. Bring a sweather.");
		}
		System.out.println("The program is ending");
	}
}
