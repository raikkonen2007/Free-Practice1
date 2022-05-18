
public class DAY2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A = 122;	// 방문객
		int B = 800;	// 가격
		int C = 38;		//얼음컵
		int	D = 130;	//빙수
		int E =	700;	//빙수가격
		String F = "명";
		String G = "재료비";
		String J = "순이익";
		final int H = B*C;
		final int I = D*E;
		int year = 2022;
		String month = "May";
		int day = 19;
		
	
		System.out.println("방문객"+':'+A+F);
		System.out.println("빙수"+':'+D+'개');
		System.out.println(G+':'+B*C+'원');
		System.out.println("판매금"+':'+D*E+'원');
		System.out.print(J+':');
		System.out.println(I-H+"원");
		
		System.out.println(month+"."+day+"th"+"."+year);
		
		
		
	
		
		
	}

}
