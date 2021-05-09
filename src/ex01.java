

class Test {

	private double base = 5; // 밑변
	private double height = 3.5; // 높이

	public double getArea() { // 삼각형의 넓이
		return (base * height) / 2;
	}

	public double getHypotenuse() { // 빗변길이
		return Math.sqrt((base * base) + (height * height));
	}

	public double getPerimeter() { // 둘레길이
		return base + height + getHypotenuse();
	}
}

public class ex01 {
	public static void main(String[] args) {
			Test t = new Test();
			
			System.out.println("삼각형의 넓이 : "+ t.getArea());
			System.out.printf("빗변길이 : %.2f\n ", t.getHypotenuse());
			System.out.printf("둘레길이 : %.2f", t.getPerimeter());
	}

}
