package bunya2.toi3;

public class ListElement {
	private String val;
	private ListElement next;
	
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	public ListElement getNext() {
		return next;
	}
	public void setNext(ListElement next) {
		this.next = next;
	}
	
	public ListElement(String qVal) {
		setVal(qVal);
		next=null;
	}

}
