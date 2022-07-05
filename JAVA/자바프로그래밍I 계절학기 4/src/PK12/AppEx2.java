package PK12;

interface InterEx2{
	
	void inti();
	void process();
	void print();
}

class BaseData {
	int cnt,sum;
}

public class AppEx2 extends BaseData implements InterEx2{

	public void inti() {	// 인터페이스의 변수 사용시 꼭 public을 붙여서 작성.
		cnt=0;
		sum=0;
		}
	
	public void process() {
		for(int i =1; i<=100; i++) 
			{
				if(i%5==0) 
				{
					System.out.printf("%4d",i);
					cnt++;
					sum+=i;
					if(cnt%7==0)
						System.out.println();
				}
			}
		
	}
	
	public void print() {
		System.out.println();
		System.out.println("개수는 " + cnt);
		System.out.println("합은 "+ sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppEx2 k = new AppEx2();

		
		k.inti();
		k.process();
		k.print();
		

	}

}
