import java.util.Scanner;

public class avo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int avo = 0;
		int milk = 1;
		
		System.out.println("우유사고 아보카도 있으면 6개 사와");
		System.out.println("아보카도가 있습니까? 0 or 1");
		
		Scanner scanner = new Scanner(System.in);
		avo = scanner.nextInt();
		
	
		if (avo>0) 
			avo=6;
		
			System.out.println("우유"+avo*milk+"개 사왔어.");
		

	}

}
