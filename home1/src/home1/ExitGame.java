package home1;

import java.util.Scanner;

public class ExitGame {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
	      int sum=0;
	      for (int i = 1; i <=5; i++) {
			System.out.print("�Է� : ");
			int num = sc.nextInt();
			sum += num;
			System.out.println("�� = "+sum);
			
			if (sum>=100) {
				i=6;
				System.out.println("���α׷� ����!");
			}
		}
	}
}
