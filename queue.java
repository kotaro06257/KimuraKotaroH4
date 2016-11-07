package homework4;

public class queue {

	int maxsize = 100;
	int[] queuearray = new int[maxsize];
	int front = 0;
	int rear = 0;
	int size = 0;

	void enqueue(int value) // inserting an element into the queue
	{
		if (size < maxsize) {
			queuearray[rear] = value;
			rear = (rear + 1) % queuearray.length;
			size++;
		} else {
			System.out.println("The queue is Full!");
		}
	}

	void dequeue() // deleting an element from the queue
	{

		if (size < 1) {
			System.out.println("Queue is Empty!");

		} else

		{

			size--;
			rear = rear - 1;
			for (int i = 0; i < size; i++) {
				queuearray[i] = queuearray[i + 1];

			}

		}

	}

	public int peek() {

		return queuearray[rear];
	}

	public int printfront() {
		return queuearray[0];
	}

	void print() // printing the elements of the queue
	{
		for (int i = 0; i < size; i++) {
			System.out.print(queuearray[i] + ",");

		}
	}

	void size() {
		System.out.print("The size of Queue:" + size);
	}

}
