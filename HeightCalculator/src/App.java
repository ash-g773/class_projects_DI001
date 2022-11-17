import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		HeightCalculator calc1 = new HeightCalculator();
		HeightCalculator calc2 = new HeightCalculator();
		
		System.out.println("Please enter the first height: Feet - ");
		calc1.setHeightFeet(Integer.parseInt(scr.nextLine()));
		
		System.out.println("Inches - ");
		calc1.setHeightInches(Integer.parseInt(scr.nextLine()));

		
		System.out.println("Please enter the second height: Feet - ");
		calc2.setHeightFeet(Integer.parseInt(scr.nextLine()));
		
		System.out.println("Inches - ");
		calc2.setHeightInches(Integer.parseInt(scr.nextLine()));
		
		calc1.sumOfHeights(calc1, calc2);
		
		System.out.println("The sum of the two heights are: " + calc1.getSumHeightsFeet() + " feet and " + calc1.getSumHeightsInches() + " inches.");
	}

}
