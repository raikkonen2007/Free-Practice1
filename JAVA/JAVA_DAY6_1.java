import java.util.Scanner;

public class rendomTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = '0';		// 유저 숫자
		int num1 = '0';		// 컴퓨터 숫자
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("미니게임");
		System.out.println(" ");
		
		System.out.println("숫자를 입력해주세요");
		num = scanner.nextInt();
		
		num1 = (int)(Math.random()*1000);
		
		if (num1>num){									// 유저 패배시
			System.out.println("컴퓨터의 숫자는" + num1);
			System.out.println("당신이 패배하였습니다!");
		}else {											// 유저 승리시
			System.out.println("컴퓨터의 숫자는" + num1);
			System.out.println("당신이 이겼습니다!");
		}

		
	}

}
