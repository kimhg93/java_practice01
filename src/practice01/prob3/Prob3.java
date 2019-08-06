package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");		
		int num = sc.nextInt();
		int result  = 0;
		if(num%2!=0) {
			for(int i=1; i<=num; i+=2) {
				result += i;				
			}
		} else {
			for(int i=0; i<=num; i+=2) {
				result+= i;
			}
		}
		System.out.println("결과 값 : "+result);
		sc.close();
	}
}