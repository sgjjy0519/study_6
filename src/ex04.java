import java.util.Scanner;

public class ex04 {
	private int r; //반지름
	private double size; // 넓이
	final double PI = 3.141592;
	
	public ex04(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 : ");
		r = sc.nextInt();
		process();
		sc.close();
	}
	
	void process() { //원의 넓이 계산하는 메서드
		size = r*r*PI;
	}
	
	void output() { // 결과 출력메서드
		System.out.printf("원의 넓이 : %.2f",size);
	}
	
	public static void main(String[] args) {
		ex04 result = new ex04();
		result.output();
	}
	/*
	Scanner sc = new Scanner(System.in);
	int r; // 반지름
	double size; // 넓이
	final double PI = 3.141592;
	
	public double process() {
		r = sc.nextInt();
		
		return size = (Math.sqrt(r)*PI);
	}
	
	public double output() {
		return process();
	}
	
	public static void main(String[] args) {
		ex04 result = new ex04();
		result.output();

	}
	*/
}
