package PK12;

class D1{
	int x=1000;
	
	void display() {
		System.out.println("상위클래스 D1의 display() 메소드 입니다.");
	}
}
class D2 extends D1{												// 상위 하위 클래스에서 this super 사용.
	int x=2000;
	
	void display() {
		System.out.println("하위클래스 D2의 display() 메소드 입니다.");
	}
	void write() {
		this.display();									// D2 			// 호출은 호출만, 생성은 해당 부분에서. 
		display();										//D2 자기가 속한 클래스의 메소드 출력.
		super.display();								//D1 
		System.out.println("D2클래스 객체 X의 값은: "+x);				// 우선순위 d2 		 () x시 객체변수,  
		System.out.println("D1클래스 객체 X의 값은: "+super.x);			// 후순위인 d1출력.		. 존재시 클래스로 만들어짐 
		}
}


public class Inheritance4 {

	public static void main(String[] args) {					// 객체 생성 후에는 this/super 사용X -> 메소스를 사용 
		// TODO Auto-generated method stub
		D2 d= new D2();
		d.write();

	}

}
