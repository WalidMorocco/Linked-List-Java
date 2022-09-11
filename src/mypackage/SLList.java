package mypackage;

public class SLList {
	
	protected SLLNode head = null;
	
	public SLList() {
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public Object first() {
		return head.info;
	}
	
	public void printAll() {
		System.out.println("\n	Nodes in the list:");
		for (SLLNode tmp = head; tmp != null; tmp = tmp.next) {
			System.out.println("		" + tmp.info);
		}
	}
	
	public void add (Object el) {
		head = new SLLNode(el,head);
		System.out.println("\n	Nodes added: " + el);
	}
	
	public Object deleteHead() {
		Object el = head.info;
		head = head.next;
		System.out.println("\n	Head node deleted. ");
		return el;
	}
	
	public void delete(Object el) {
		if (head != null) {
			if (el.equals(head.info)) {
				head = head.next;
			}
			else {
				SLLNode pred = head, tmp = head.next;
				for (; tmp !=null && !(tmp.info.equals(el)); pred = pred.next, tmp = tmp.next);
				if (tmp != null) {
					pred.next = tmp.next;
					System.out.println("\n	Node deleted: " + el);
				}
				
			}
		}

		
	}
}
