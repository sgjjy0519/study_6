import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Area ar = new Area();
		
		while(true) {
			if(ar.menu() == 4) // ar.menu 가 4면 반복문 종료
				break;
		}
		

	}

}

class Area{
	double area;
	final double PI = 3.141592;
	
	Scanner sc = new Scanner(System.in);
	
	Area(){
		this.area = 0.0; // 넓이를 저장할 변수 초기화
	}
	
	public void circle() {
		System.out.println("*****원의 넓이*****");
		System.out.print("반지름 : ");
		int r = sc.nextInt(); // 반지름
		
		area =  r*r*PI;       // 원의 넓이 리턴
		output();
	}
	
	public void triangle() {
		System.out.println("*****삼각형의 넓이*****");
		System.out.print("밑변 : ");
		int bottom = sc.nextInt();  //밑변
		System.out.print("높이 : ");
		int height = sc.nextInt();  //높이
		
		area = bottom * height/2;   // 삼각형의 넓이 리턴
		output();
	}
	
	public void trapezoid() {
		System.out.println("*****사다리꼴의 넓이*****");
		System.out.print("반지름 : ");
		int bottom = sc.nextInt(); //밑변
		System.out.print("윗변 : ");
		int top = sc.nextInt();	   //윗변
		System.out.print("높이 : ");
		int height = sc.nextInt(); //높이
		
		area = (bottom+top)*height/2;
		output();
	}
	
	void output() { // 출력메서드
		System.out.printf("넓이 : %.2f",area);
	}
	
	public int menu() {
		int n;
		System.out.println("*****도형선택*****");
		System.out.println("1.삼각형");
		System.out.println("2.원");
		System.out.println("3.사다리꼴");
		System.out.println("4.종료");
		System.out.print("번호선택 : ");
		
		n = sc.nextInt();
		
		switch(n) {
		case 1:
			triangle();
			break;
		case 2:
			circle();
			break;
		case 3:	
			trapezoid();
			break;
		case 4:
			System.out.println("종료합니다.");
		}
		
		return n;
	}
}