package line;

import java.util.*;

public class line {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("welcome to line comparision");

		System.out.println("Enter the First Line of First point coordinates");
		System.out.println("Enter x1 value");
		int x1 = scan.nextInt();
		System.out.println("Enter y1 value");
		int y1 = scan.nextInt();

		System.out.println("Enter the First Line of Second point coordinates");
		System.out.println("Enter x2 value");
		int x2 = scan.nextInt();
		System.out.println("Enter y2 value");
		int y2 = scan.nextInt();
		double dis1, dis2;

		dis1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("Lenght of line 1: " + dis1);

		System.out.println("Enter the Second Line of First point coordinates");
		System.out.println("Enter x3 value");
		int x3 = scan.nextInt();
		System.out.println("Enter y3 value");
		int y3 = scan.nextInt();

		System.out.println("Enter the Second Line of Second point coordinates");
		System.out.println("Enter x4 value");
		int x4 = scan.nextInt();
		System.out.println("Enter y4 value");
		int y4 = scan.nextInt();

		dis2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("Lenght of line 2: " + dis2);

		if (dis1 == dis2) {
			System.out.println("Two Lines are Equals");
		} else
			System.out.println("Two Lines are Not Equals");

	}

}
