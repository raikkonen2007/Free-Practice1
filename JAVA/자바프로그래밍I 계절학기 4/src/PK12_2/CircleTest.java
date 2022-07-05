package PK12_2;

class shapeCr{
	int x,y;
}

class Circle extends shapeCr{
	int radius;
	public String calcArea;
	
	public Circle(int radius) {
		this.radius = radius;
		x=0;
		y=0;
	}
	
	double CalcArea() {
		return 3.14*radius*radius;
	}
	
}



public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle obj = new Circle(10);
		System.out.println("원의 중심"+"(obj.x*3.14*obj.y)");
		System.out.println("원의 면적: "+ obj.CalcArea());

	}

}
