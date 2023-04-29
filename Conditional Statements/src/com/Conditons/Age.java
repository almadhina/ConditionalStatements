package com.Conditons;

import java.util.*;

public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age > 20) {

			System.out.println("These Person Is Adult");
		} else {
			System.out.println("These Person Is Not Adult");
		}
	}

}
