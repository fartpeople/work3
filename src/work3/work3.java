package work3;

import java.util.Scanner;

public class work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int a, b;
		System.out.print("請輸入a與b的值:");
		a = scn.nextInt();
		b = scn.nextInt();
		int i = a,sum = 0;
		while(i <= b){
			sum += i;
			i++;
		}
		System.out.print("從" + a + "加到" + b + "的總和為" + sum);
	}

}
