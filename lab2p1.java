package lab2;

import java.util.*;
import java.lang.*;

public class lab2p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice, n, m;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1. multiplication test");
			System.out.println("2. quotient using division by subtraction");
			System.out.println("3. remainder using division by subtraction");
			System.out.println("4. count the number of digits");
			System.out.println("5. position of a digit");
			System.out.println("6. extract all odd digits");
			System.out.println("7. quit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: //add mulTest()
				mulTest();
				break;
			case 2: //add divide()
				System.out.println("enter a number: ");
				n = sc.nextInt();
				System.out.println("enter another number:");
				m = sc.nextInt();
				System.out.println(n + " / " + m + " = " + divide(n, m));
				break;
			case 3: //add modulus()
				System.out.println("enter a number: ");
				n = sc.nextInt();
				System.out.println("enter another number:");
				m = sc.nextInt();
				System.out.println(n + " mod " + m + " = " + modulus(n, m));
				break;
			case 4: //add countDigits()
				System.out.println("enter a number: ");
				n = sc.nextInt();
				m = countDigits(n);
				if(m == -1) System.out.println("error");
				else System.out.println(n + " - count = " + m);
				break;
			case 5: //add position()
				System.out.println("enter a number: ");
				n = sc.nextInt();
				System.out.println("enter another number:");
				m = sc.nextInt();
				System.out.println("Position of " + m + " in " + n + " is " + position(n, m));
				break;
			case 6: //add extractOddDigits()
				System.out.println("enter a number: ");
				n = sc.nextInt();
				m = extractOddDigits(n);
				if(m == -2) System.out.println("error");
				else System.out.println("oddDigits = " + m);
				break;
			case 7: System.out.println("Program terminating");
			}
		}while(choice < 7);
	}
	
	public static void mulTest(){
		int n1, n2, input;
		int correctCnt = 0;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			n1 = rd.nextInt(10) + 1;
			n2 = rd.nextInt(10) + 1;
			System.out.println("How much is " + n1 + " times " + n2 + " ?");
			input = sc.nextInt();
			if(input == n1 * n2) correctCnt++;
		}
		System.out.println(correctCnt + " out of 5 is correct.");
		return;
	}

	public static int divide(int n, int m) {
		int cnt = 0;
		while(n >= m) {
			n -= m;
			cnt++;
		}
		return cnt;
	}
	
	public static int modulus(int n, int m) {
		while(n >= m) n -= m;
		return n;
	}
	
	public static int countDigits(int n) {
		if (n < 0) return -1;
		int cnt = 0;
		while (n > 0) {
			n /= 10;
			cnt++;
		}
		return cnt;
	}
	
	public static int position(int n, int m) {
		int x = n % 10;
		int cnt = 1;
		while(x != m && n > 0) {
			n /= 10;
			x = n % 10;
			cnt++;
		}
		if (x != m)return -1;
		return cnt;
	}
	
	public static int extractOddDigits(int n) {
		if(n < 0) return -2;
		int x = 0;
		int evenOdd;
		int mul = 1;
		while(n > 0) {
			evenOdd = n % 10;//stores a digit here
			if(evenOdd % 2 == 1) {
				x += evenOdd * mul;
				mul *= 10;
			}
			n /= 10;
		}
		if(x == 0) return -1;
		return x;
	}
}
