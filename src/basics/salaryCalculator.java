package basics;

public class salaryCalculator {
	public static void main(String[] args) {
		String career;
		System.out.println("Program is starting");
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 20;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
	}
}
