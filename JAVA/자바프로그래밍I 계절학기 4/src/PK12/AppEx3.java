package PK12;

import java.util.Scanner;

interface InterEx3{
	void input();
	void eavg();
	void esum();
	void grade();
	void eprint();
	
}

class Data{
	double[]arr;
	double sum;
	double avg;
	char grade;
	
	
}

public class AppEx3 extends Data implements InterEx3 {
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		int num,num1;
		System.out.print("점수의 개수를 입력해주세요: ");
		num=sc.nextInt();
		arr= new double[num];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("score["+ i + "]: ");
			arr[i]=sc.nextDouble();
		}
	}
	
	public void esum() {
		sum=0;
		for(int i =0; i<arr.length; i++) {
			sum+=arr[i];
		}
	}
	
	public void eavg() {
		avg=sum/arr.length;
	}
	
	public void grade() {
		
		if(avg<=100 && avg>=90) {
			grade = 'A';
		}else if(avg<90 && avg>=80) {
			grade = 'B';
		}else if(avg<80 && avg>=70) {
			grade = 'C';
		}else if(avg<70 && avg>=60) {
			grade = 'D';
		}else
			grade = 'F';
	}
	
	public void eprint() {
		System.out.printf("당신의 점수의 합은 %.2f점 이며 평균은 %.2f점 입니다.",sum,avg);
		System.out.printf("당신의 학점은 [%c]입니다.",grade);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppEx3 k = new AppEx3();
		
		k.input();
		k.esum();
		k.eavg();
		k.grade();
		k.eprint();
		
		

	}

}
