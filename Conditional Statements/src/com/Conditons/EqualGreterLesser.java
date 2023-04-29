package com.Conditons;

import java.util.*;

public class EqualGreterLesser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == b) {
			System.out.println("Equal");
		} else {
			if (a > b) {
				System.out.println("Greter");
			} else {
				System.out.println("Lesser");
			}
		}
	}

}
