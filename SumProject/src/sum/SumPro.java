package sum;

import java.util.Scanner;

public class SumPro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1입력>>");
		int num1 = sc.nextInt();
		System.out.print("숫자2입력>>");
		int num2 = sc.nextInt();
		System.out.println("합:"+(num1+num2));
	}

}
