
public class LinkedList {
	private Reading head = null;
	private Reading tail = null;
	
	public void add(Reading element) {
		
		if (head == null) {
			
			head = element;
			tail = element;
		}
		else {
			tail.setNext(element);
			tail = tail.getNext();
		}
		// print();
	}
	
	public void print() {
		
		Reading current = head;
		
		while (current != null) {
			
			System.out.println(current.getCity() + " - " + current.getAvgTemperature());
			current = current.getNext();
			
		}
	}
	
	public Reading findMax() {
		
		Reading maxTemp = head;
		Reading current = head;
		
		while (current != null) {
			
			if (current.getAvgTemperature() > maxTemp.getAvgTemperature()) maxTemp = current;
			
			current = current.getNext();
		}
		
		return maxTemp;
	}
public Reading findMin() {
		
		Reading minTemp = head;
		Reading current = head;
		
		while (current != null) {
			
			if (current.getAvgTemperature() != -99.0) {
			if (current.getAvgTemperature() < minTemp.getAvgTemperature()) minTemp = current;
			}
			current = current.getNext();
		}
		
		return minTemp;
	}
	
	
}
