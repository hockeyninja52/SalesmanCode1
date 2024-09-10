package driver;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name1, name2, name3, input;
		int s1,s2, s3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("There are already 6 people in the array");
		System.out.println("Input 3 more people.");
		
		System.out.println("What is the name of the first person: ");
		name1 = (scanner.nextLine());
		System.out.println("How much do they make? (1000-2000): ");
		input = (scanner.nextLine());
		s1 = Integer.parseInt(input);
		
		System.out.println("What is the name of the second person: ");
		name2 = (scanner.nextLine());
		System.out.println("How much do they make? (1000-2000): ");
		input = (scanner.nextLine());
		s2 = Integer.parseInt(input);
		
		System.out.println("What is the name of the third person: ");
		name3 = (scanner.nextLine());
		System.out.println("How much do they make? (1000-2000): ");
		input = (scanner.nextLine());
		s3 = Integer.parseInt(input);
		
		Salesman N1 = new Salesman(name1, s1);
		Salesman N2 = new Salesman(name2, s2);
		Salesman N3 = new Salesman(name3, s3);
		
		Salesman Blade = new Salesman("Blade", 1000);
		Salesman Luca = new Salesman("Luca", 1000);
		Salesman Joesph = new Salesman("Joesph", 1250);
		Salesman Jasmine = new Salesman("Jasmine", 1700);
		Salesman Tom = new Salesman("Tom", 1800);
		Salesman Kerry = new Salesman("Kerry", 1500);
		Salesman Jack = new Salesman("Jack", 1300);
		
		Salesman[] sales = new Salesman[] {Blade, Luca, Joesph, Jasmine, Tom, Kerry, Jack, N1, N2, N3};
		Salesman[] top5 = Salesman.topFive(sales);
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1)+ " " + top5[i].display());
		}
		
	}

}
