package �����б�;

import java.util.Scanner;

public class AppEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mon;
		
		Scanner sc = new Scanner(System.in);
		
		
		do{
			System.out.print("1�� ~ 12���� �ش��ϴ� ���ڸ� �Է��ϼ���.: ");
			mon = sc.nextInt();
			if( mon>12 || mon<1)
				System.out.printf("[%d]���� �����ϴ�. �ٽ� �Է��ϼ���.\n",mon); 
				
		}while( mon>12 || mon<1);
			System.out.printf("����� [%d]���� �����ϼ̽��ϴ�. �ݰ����ϴ�.",mon);

	}

}
