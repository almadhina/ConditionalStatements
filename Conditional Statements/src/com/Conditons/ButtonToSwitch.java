package com.Conditons;

import java.util.*;

public class ButtonToSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int button = sc.nextInt();

		switch (button) {

		case 1:
			System.out.println("Motu Bhai");
			break;
		case 2:
			System.out.println("Eleiyaz");
			break;
		case 3:
			System.out.println("Nafi");
			break;
		case 4:
			System.out.println("Shafi");
			break;
		default:
			System.out.println("Invalid Button");
		}

	}

}
