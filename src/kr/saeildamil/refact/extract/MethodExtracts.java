package kr.saeildamil.refact.extract;


public class MethodExtracts {
	public static void main(String[] args) {
		Custom cs01 = new Custom("김태희");
		Custom cs02 = new Custom("박보영");
		
		cs01.addOrder(new Order(3000, "2012/12/01", "맥주 500cc",1));
		cs01.addOrder(new Order(5000, "2012/12/01", "노가리",1));
		cs01.addOrder(new Order(3000, "2012/12/02", "소주",3));
		cs01.addOrder(new Order(10000, "2012/12/02", "과메기",2));
		
		cs02.addOrder(new Order(3000, "2012/12/01", "소주",3));
		cs02.addOrder(new Order(15000, "2012/12/01", "부대찌개",	1));
		cs02.addOrder(new Order(10000, "2012/12/01", "과일",1));
		
		cs01.printOwing();
		cs02.printOwing();
	}
}
