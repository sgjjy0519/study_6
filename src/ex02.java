
class Test02{
	final double PI = 3.141593;
	
	public double area(int a) {  //원의 넓이
		return a*a*PI;
	}
	
	public double area(int a, int b) { // 사각형의 넓이
		return a*b;
	}
	
	public double area(int a, int b, int c) { // 사다리꼴의 넓이
		return (double)(a+b)*c/2;
	}
}

public class ex02 {

	public static void main(String[] args) {
		Test02 t1 = new Test02();
		
		System.out.println("원의 넓이 : "+t1.area(3));
		System.out.println("사각형의 넓이 : "+t1.area(4, 5));
		System.out.println("사다리꼴의 넓이 : "+t1.area(3, 4, 7));
		
		
		
	}

}
