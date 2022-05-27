import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = '0';
		int num2 = '0';
		int num3 = '0';
		int num4 = '0';
		
		
		String op1 = "";
		String op2 = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-계산기 ver.2-");
		
		System.out.println("첫번째 숫자를 입력해주세요.");
		num1 = scanner.nextInt();
		
		System.out.println("첫번째 연산자를 입력해주세요");
		op1 = scanner.next();
		
		System.out.println("두번째 숫자를 입력해주세요.");
		num2 = scanner.nextInt();
		
		System.out.println("두번째 연산자를 입력해주세요.");
		op2 = scanner.next();
		
		System.out.println("세번째 숫자를 입력해주세요.");
		num3 = scanner.nextInt();
		
		if(op1.equals("+")) {
			if(op2.equals("+")) {
				num4 = num1+num2+num3;
			} else if(op2.equals("-")) {
				num4 = num1 + num2 - num3;
			} else if(op2.equals("*")) {
				num4 = num1 + num2 * num3;
			} else {
				num4 = num1 + num2 / num3;
			}
		} else if(op1.equals("-")) {
			if(op2.equals("+")) {
				num4 = num1 - num2+num3;
			} else if(op2.equals("-")) {
				num4 = num1 - num2 - num3;
			} else if (op2.equals("*")) {
				num4 = num1 - num2 * num3;
			}else {
				num4 = num1 - num2 / num3;
			} 
		}else if(op1.equals("*")) {
			if(op2.equals("+")) {
				num4 = num1 * num2+num3;
			} else if(op2.equals("-")) {
				num4 = num1 * num2 - num3;
			} else if (op2.equals("*")) {
				num4 = num1 * num2 * num3;
			}else {
				num4 = num1 * num2 / num3;
			}
		}else{
			if(op2.equals("+")) {
				num4 = num1 / num2 + num3;
			} else if(op2.equals("-")) {
				num4 = num1 / num2 - num3;
			} else if (op2.equals("*")) {
				num4 = num1 / num2 * num3;
			}else {
				num4 = num1 / num2 / num3;
			}
		}
			
			System.out.println("계산결과는 "+num4+" 입니다.");

		
	
	}
}
