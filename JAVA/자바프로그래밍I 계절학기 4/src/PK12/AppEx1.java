package PK12;

interface InterEx1{							// 인터페이스에 메소드 -> 추상메소드 
	void setName(String name);
	void setAge(int age);
	void setScore(double score);
	String getName();
	int getAge();
	double getScore();
}

class SourceData{			// 변수만 존재 구분 
	protected String name;         //private 클래스 내에서만 사용가능. 프텍 패키지 내에서 사용가능, 
	protected int age;
	protected double score;
}

class DataProcess extends SourceData implements InterEx1 {			// implements 인터페이스 불러오기.		// 소스데이터 상속, //imple- 는 extends 뒤에 위치 후순위.
							// 수행메소드만 존재  구분 					
	
	public void setName(String name) {	this.name= name;	}
	public void setAge(int age) {	this.age = age;	}
	public void setScore(double score) {	this.score=score;	}

	public String getName(){	return name;	}
	public int getAge() {	 return age;	}
	public double getScore() {	return score;	}
}

public class AppEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DataProcess std= new DataProcess();
			
			std.setName("박달문");
			std.setAge(30);
			std.setScore(45.5);
			
			System.out.println("이름: "+ std.getName() + "\n" + "나이: " + std.getAge() + "\n" + "점수: " + std.getScore());

	}
}
