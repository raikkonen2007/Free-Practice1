package 계절학기;

import java.util.Scanner;

public class AppEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mon;
		
		Scanner sc = new Scanner(System.in);
		
		
		do{
			System.out.print("1월 ~ 12월에 해당하는 숫자를 입력하세요.: ");
			mon = sc.nextInt();
			if( mon>12 || mon<1)
				System.out.printf("[%d]월은 없습니다. 다시 입력하세요.\n",mon); 
				
		}while( mon>12 || mon<1);
			System.out.printf("당신은 [%d]월들 선택하셨습니다. 반갑습니다.",mon);

	}

}
