package PK12;

class C1{
	static int x;				// static 전역변수.   / 장점 사용시 객체생성 생략 가능. / 단점 메모리 소모 높음.
	static int y;
}

class C2 extends C1{
	static String x;
}


public class Inheritance3 {

	public static void main(String[] args) {
													// 객체 생성x (new)
		C2.x="자바";

		C1.x=30000;
		C1.y=20000;
		
		System.out.println("클래스 변수 C2.x의 값: "+C2.x);
		System.out.println("클래스 변수 C2.y의 값(C1으로부터 상속): "+C2.y);		// C2에 y는 없지만 C1 y값 상속.
		System.out.println("클래스 변수 C1.x의 값: "+C1.x);
	}

}
