package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo {
	private static Scanner sc;

	public ExceptionDemo() {
		sc = new Scanner(System.in);
	}

	public int arrayException(int[] arr) {
		int res = 0;
		System.out.println("Entr the index");
		int b = sc.nextInt();
		try {
			res = arr[b];
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return res;
	}

	public int calculation(int a, int b) {
		int res = 0;
		try {
			res = a / b;
		} catch (ArithmeticException e2) {
			e2.printStackTrace();
		}
		return res;

	}

	public void fileexception(String ss) {
		File f = new File("d:/myfile.txt");
		FileWriter f1;
		try {
			f1 = new FileWriter("d:/myfile.txt");
			for (int i = 1; i <= ss.length(); i++) {
				f1.write(ss.charAt(i));
			}
		} catch (Exception e3) {
			e3.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExceptionDemo ed = new ExceptionDemo();
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			a[i] = x;
		}
		System.out.println(ed.arrayException(a));
		System.out.println("Enter the number");
		int first = sc.nextInt();
		int second = sc.nextInt();
		System.out.println(ed.calculation(first, second));
		System.out.println("Enter the String");
		String ss = sc.nextLine();
		ed.fileexception(ss);
		System.out.println("Enter the Min balance");
		int val = sc.nextInt();
		UserException ue = new UserException();
		try {
			System.out.println(ue.toString(val));
		}
		catch(Exception e4) {
			e4.printStackTrace();
		}

	}

}
