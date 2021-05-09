
public class ex05 {

	public static void main(String[] args) {
		MyTest t1 = new MyTest(10, 20);
		MyTest t2 = new MyTest(12.4, 9.45);
		MyTest t3 = new MyTest('Z', 'p');
	}

}

class MyTest{
	
	public MyTest() { // 기본생성자
		
	}
	
	public MyTest(int a, int b) {  // 오버로딩
		System.out.println("더 큰값 : "+(a>b ? a:b));
	}
	
	public MyTest(double a, double b) { // 오버로딩
		System.out.println("더 큰값 : "+(a>b ? a:b));		
	}
	
	public MyTest(char a, char b) { // 오버로딩
		System.out.println("더 큰값 : "+(a>b ? a:b));
	}
}
