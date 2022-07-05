package PK12_1;

public class SportCar extends Car {
	
	boolean turbo;
	
		public void setTurbo(boolean flag) {			// 터보설정 메소드 
			turbo=flag;
			System.out.println("turbo: "+turbo);
		}
}

	