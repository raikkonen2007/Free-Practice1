import java.util.Scanner;

public class Bank_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   // 1.예금 2.출금 3.잔고
		int num1 = 0;		// 예금
		int num2 = 0;		// 출금
		int num3 = 30000;		// 잔고
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("| 1.예금 | 2.출금 | 3.잔고 |");
		System.out.println("--------------------------");
		int i = scanner.nextInt();
		
		if(i==1) {
			System.out.println("금액을 입력해주세요.");
			num1 = scanner.nextInt();
			num3 = num1+num3;
			System.out.println("예금액은 "+num3+"원 입니다.");
		}else if(i==2) {
			System.out.println("금액을 입력해주세요.");
			num2 = scanner.nextInt();
			if(num3-num2 < 0) {
				System.out.println("잔액이 부족합니다.");
				}else {
					num3-=num2;
					System.out.println("출금액은 "+num2+"원 입니다.");
					System.out.println("잔액은 "+(num3)+"원 입니다.");
				} 
		}else if(i==3) {
			System.out.println("현재 잔액은 "+num3+"원 입니다.");
					
				}
		System.out.println("----------");
		System.out.println("시스템 종료");
	}

}
