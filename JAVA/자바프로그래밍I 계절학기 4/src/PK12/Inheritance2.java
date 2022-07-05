package PK12;

class B1{
	int x;
}
class B2 extends B1{
	String x;
}
public class Inheritance2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub									// 서로 다른 데이터형 사용시 다른 객체를 생성하여 사용. 
		B2 b2 = new B2();
		
		b2.x="자바";
		System.out.println("객체 B2에 들어있는 x값: "+ b2.x);
		
		B1 b1 = new B1();
		
		b1.x=5000;
		System.out.println("객체 B2에 들어있는 x값: "+ b1.x);
		

	}

}
