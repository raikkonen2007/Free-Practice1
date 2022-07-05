package PK12_2;

class ShapeRec{
	protected int x,y;
	
	void print() {System.out.println("x좌표" + x +"y좌표"+y); }
}


public class RectangleTest extends ShapeRec{
	int width, height;
	
	double calcArea() {
			return width*height;
	}
	
	void draw() {
		print();
		System.out.printf("(%d,%d) 위치에 가로: %d 세로: %d\n",x,y,width,height);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleTest k = new RectangleTest();
		
		k.x=10;
		k.y=20;
		k.width=100;
		k.height=50;
		k.draw();
		System.out.println("사격형의 면적: "+ k.calcArea());
		
		

	}

}
