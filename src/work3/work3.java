package work3;

import java.util.Scanner;

public class work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int a, b;
		System.out.print("�п�Ja�Pb����:");
		a = scn.nextInt();
		b = scn.nextInt();
		int i = a,sum = 0;
		while(i <= b){
			sum += i;
			i++;
		}
		System.out.print("�q" + a + "�[��" + b + "���`�M��" + sum);
	}

}
