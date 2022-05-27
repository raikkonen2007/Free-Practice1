import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	//	
		
		int num1 = '0';
		int num2 = '0';
		int num3 = '0';
		
		String op = "";
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		num1 = scanner.nextInt();
		
		System.out.println("연산자를 입력해주세요");
		op = scanner.next();
		
		System.out.println("숫자를 입력해주세요");
		num2 = scanner.nextInt();
		
		if(op.equals("+")) {
			num3 = num1 + num2;
		}else if(op.equals("-")){
			num3 = num1 - num2;
		}else if(op.equals("*")) {
			num3 = num1 * num2;
		}else {
			num3 = num1 / num2;
		}
		
		System.out.println(num3+"입니다.");
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		System.out.println("연산자="+op );
	}

}
