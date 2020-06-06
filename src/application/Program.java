package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("******* Data Input *******");
		String name;
		int age;
		double height;
		System.out.print("Name: ");
		name = sc.next();
		System.out.print("Age:");
		age = sc.nextInt();
		System.out.print("Height:");
		height = sc.nextDouble();
		System.out.print("\n");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height);
		sc.close();
	}

}
