

public class MyQueue {

	private Node<Person> front, back;
	private int length;

	public MyQueue(){
		length = 0;
	}
	public void join(Person p){
		//This method adds a Person to the back of the queue.
		if(isEmpty()){
			back = new Node<Person>(p);
			front = back;
		}

		else{
			back.setNext(new Node<Person>(p));
			back = back.getNext();
		}

		length++;

	}
	public Person leave(){
		//This method returns the person at the front of the queue, and then disposes 
		//of that person and moves the next Person to the front of the queue.
		if(!isEmpty()){
			Person temp = front.getData();
			front = front.getNext();
			length --;
			return temp;
		}
		else{
			System.out.println("Sorry, this queue is empty!");
			return null;
		}

	}
	public int getLength(){
		return this.length;

	}
	public boolean isFull(){
		//This method returns false, because this queue should never be full.
		return false;

	}
	public boolean isEmpty(){
		//This method returns true if the length is 0.
		return length == 0;

	}
	


}
