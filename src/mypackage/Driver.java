package mypackage;


public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Singly linked list: ");
		
		SLList ll = new SLList();
		
		ll.add("toDelete");
		
		// add() adds a node to the list
		ll.add(12);
		
		// first() return first node of the list
		System.out.println("\n First node of the list: " + ll.first());
		
		// isEmpty() returns if the list is empty or not (boolean)
		System.out.println("\n Is the list empty: " + ll.isEmpty());
		
		// printAll() returns all the node of the list
		ll.printAll();
		
		// deleteHead() deletes the fist node of the list
		ll.deleteHead();
		
		// delete() deletes a specific node from the list passed as an argument
		ll.delete("toDelete");
		
		// isEmpty() returns if the list is empty or not (boolean)
		System.out.println("\n Is the list empty: " + ll.isEmpty());
	}

}
