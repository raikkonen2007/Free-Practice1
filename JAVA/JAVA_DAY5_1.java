import java.util.Scanner;

public class switchTset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = '0';
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Formula 1 챔피언 Archive");
		System.out.println("<2007~2021년>");
		System.out.println("연도를 입력해주세요");
		
		year = scanner.nextInt();
		
		switch(year) {
			case 2007 : 
				System.out.println("2007년 챔피언 키미 라이코넨");
				break;
			case 2008 : case 2014 : case 2015 : case 2017 : case 2018 : case 2019 : case 2020 :
				System.out.println("2008년 챔피언 루이스 해밀턴");
				break;
			case 2009 : 
				System.out.println("2009년 챔피언 젠슨 버튼");
				break;
			case 2010 : case 2011 : case 2012 : case 2013 :
				System.out.println("2010년 챔피언 제바스티안 페텔");
				break;
			case 2016 : 
				System.out.println("2016년 챔피언 니코 로즈버그");
				break;
			case 2021 : 
				System.out.println("2021년 챔피언 막스 베르스타펜");
			break;
		}
		
		

	}

}
