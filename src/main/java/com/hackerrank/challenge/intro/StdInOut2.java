package com.hackerrank.challenge.intro;

import java.util.Scanner;

public class StdInOut2 {

	public static void main(String[] args) {
		test();
	}

	public static void test() {
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}
}
