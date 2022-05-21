import java.util.Scanner;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("-계산기 ver.1-");
		System.out.println("숫자를 입력해주세요");
		String str1 = scanner.nextLine();
		//int num1 = scanner.nextInt();
		
		System.out.println("사칙연산");
		String op = scanner.nextLine();
		//int op = scanner.nextInt();
		System.out.println("숫자를 입력해주세요");
		String str2 = scanner.nextLine();
		//int num2 = scanner.nextInt();
		
		int num1 = Integer.parseInt(str1);
	    int num2 = Integer.parseInt(str2);
		int num3;
		
		if(op.equals("+")) {
				num3=num1+num2;
		}
		else if(op.equals("-")) {
				num3=num1-num2;
		}
		else if(op.equals("/")) {
				num3=num1/num2;
		}
		else {
			num3=num1*num2;
		}
		
		System.out.println(num1+op+num2+"="+num3);
		
		
	}

}
