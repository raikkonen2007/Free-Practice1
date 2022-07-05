package PK12_1;

public class Car {													// 클래스만 구현상태 
	int speed;		// 속도 
	
	public void setSpeed(int speed) {		// 속도변경 메소드 
		System.out.println("입력전 speed: "+ this.speed);
		this.speed=speed;
		System.out.println("입력후 speed: "+ this.speed);
		
	
	}
}
