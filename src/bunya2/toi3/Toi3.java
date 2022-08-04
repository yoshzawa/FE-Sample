package bunya2.toi3;

public class Toi3 {

	static ListElement listHead = null;
	
	public static void main(String[] args) {
		listHead = null;
		append("hello");
		append("world");

	}
	static void append(String qVal) {
		ListElement prev=null,curr=null;
		curr = new ListElement(qVal);
		if(a()) {
			listHead=curr;
		} else {
			prev=listHead;
			while(prev.getNext() != null) {
				prev=prev.getNext();
			}
			prev.setNext(b(curr));
		}
	}
	
	private static boolean a() {
		throw new RuntimeException();
	}

	private static ListElement b(ListElement curr) {
		throw new RuntimeException();
	}
	
	private static boolean a_1() {
		return listHead == null;
	}

	private static boolean a_2() {
		return listHead != null;
	}

	private static ListElement b_1(ListElement curr) {
		return curr;
	}
	private static ListElement b_2(ListElement curr) {
		return curr.getNext();
	}
	private static ListElement b_3(ListElement curr) {
		return listHead;
	}

	
}
