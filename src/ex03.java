class BookShop{
	String bname;   //책이름
	String author;  //저자
	int price; 		//가격
	
	public void setBook(String bname, String author, int price) {
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	
	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void viewBook() {
		System.out.println("책이름 : "+bname);
		System.out.println("저   자 : "+author);
		System.out.println("가   격 : "+price+"원");
	}
	
}

public class ex03 {

	public static void main(String[] args) {
		BookShop bs = new BookShop();
		bs.setBook("자바공부", "정열심", 25000);
		bs.viewBook();
		System.out.println();
		
		bs.setBname("EPL 1위 리버풀");
		bs.setAuthor("클 롭");
		bs.setPrice(18000);
		
		System.out.print("책이름 :"+bs.getBname()+"\n"+"저   자:"+bs.getAuthor()+"\n"+"가   격:"+bs.getPrice()+"원");
	}

}
