package practice02.prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 : ");
		int money = sc.nextInt();
		int unit = 50000;
		int flag = 1;
		int[] wallet = new int[10];
		for(int i=0; i<wallet.length; i++) {
			if(money/unit!=0) {
				wallet[i] = money/unit;
				money = money-(money/unit*unit);
				System.out.println(unit+"원 : "+wallet[i]+"개");
				if(flag==1)
					unit = unit/5;
				else 
					unit = unit/2;
				flag = flag*-1;				
			}
		}
		sc.close();
	}
}
