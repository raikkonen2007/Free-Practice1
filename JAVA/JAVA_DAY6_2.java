import java.util.Scanner;

public class cal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			// switch로 계산기 만들기
		int num1 = '0'; int num2 = '0'; int num3 = '0'; int num4 = '0';	int num5 = '0';
		
		String op1 = "";	String op2 = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("계산기 ver3");
		System.out.println(' ');
		
		System.out.println("숫자를 입력해주세요.");
		num1 = scanner.nextInt();
		
		System.out.println("첫번째 연산자를 입력해주세요.");
		op1 = scanner.next();
	
		System.out.println("숫자를 입력해주세요.");
		num2 = scanner.nextInt();
	
		System.out.println("두번째 연산자를 입력해주세요.");
		op2 = scanner.next();
	
		System.out.println("숫자를 입력해주세요.");
		num3 = scanner.nextInt();
		
		switch(op1) {
			case "+" :
				num4 = num1 + num2;
				break;	
			case"-":
				num4 = num1 - num2;
				break;
			case"*":
				num4 = num1 * num2;
				break;
			case"/":
				num4 = num1 / num2;
				break;
		} switch(op2) {
			case "+" :	
				num5 = num4 + num3;
				break;	
			case"-":
				num5 = num4 - num3;
				break;
			case"*":
				num5 = num4 * num3;
				break;
			case"/":
				num5 = num4 / num3;
				break;
		}
		
		System.out.println("계산결과는 " + num5 + "입니다.");

	}

}
