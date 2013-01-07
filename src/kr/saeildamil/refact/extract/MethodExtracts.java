package kr.saeildamil.refact.extract;

public class MethodExtracts {
	public static void main(String[] args) {
		Custom cs01 = new Custom("������");
		Custom cs02 = new Custom("�ں���");
		
		cs01.addOrder(new Order(3000, "2012/12/01", "���� 500cc",1));
		cs01.addOrder(new Order(5000, "2012/12/01", "�밡��",1));
		cs01.addOrder(new Order(3000, "2012/12/02", "����",3));
		cs01.addOrder(new Order(10000, "2012/12/02", "��ޱ�",2));
		
		cs02.addOrder(new Order(3000, "2012/12/01", "����",3));
		cs02.addOrder(new Order(15000, "2012/12/01", "�δ��",	1));
		cs02.addOrder(new Order(10000, "2012/12/01", "����",1));
		
		cs01.printOwing();
		cs02.printOwing();
	}
}
