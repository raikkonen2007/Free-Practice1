package PK12;

class A{
	int aa=1;
}

class B extends A{			//B에 A상속 ->aa,bb
	int bb=2;
}

class C extends B{			//C에 B상속 ->b는 이미 a상속 -> aa,bb,cc 모두 사용가능.
	int cc=3;
}
public class Inheritance1{
		public static void main(String[]agrs) {
			C objc=new C();		// c-> c+a,b상속 
			
			System.out.println("objc 객체의 객체속성변수 aa의 값은: "+ objc.aa);
			System.out.println("objc 객체의 객체속성변수 aa의 값은: "+ objc.bb);
			System.out.println("objc 객체의 객체속성변수 aa의 값은: "+ objc.cc);
			
	}

}
