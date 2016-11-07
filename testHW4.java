/**
 *
 */
package homework4;

/**
 * @author Kotaro
 *
 */
public class testHW4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		stack s = new stack();
		stack s2 = new stack();
		queue q = new queue();


		System.out.println("Stack:");
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.print();

		System.out.println("\npop and print:");

		System.out.print(s.pop() + ",");
		System.out.print(s.pop()+ ",");
		System.out.print(s.pop()+ ",");
		System.out.print(s.pop()+ ",");
		System.out.println(s.pop());


		System.out.println("Stack to Queue:");
		System.out.println("Queue:");
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(1);
		q.print();

		System.out.println("\ndequeue and print:");
		System.out.print(q.printfront()+ ",");
		q.dequeue();
		System.out.print(q.printfront()+ ",");
		q.dequeue();
		System.out.print(q.printfront()+ ",");
		q.dequeue();
		System.out.print(q.printfront()+ ",");
		q.dequeue();
		System.out.println(q.printfront());
		q.dequeue();

		System.out.println("");

		System.out.println("Queue to Stack:");
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		System.out.println("\npop and print:");

		System.out.print(s.pop() + ",");
		System.out.print(s.pop()+ ",");
		System.out.print(s.pop()+ ",");
		System.out.print(s.pop()+ ",");
		System.out.println(s.pop());


		System.out.println("\ndequeue and print:");
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.print(q.printfront()+ ",");
		q.dequeue();
		System.out.print(q.printfront()+ ",");
		q.dequeue();
		System.out.print(q.printfront()+ ",");
		q.dequeue();
		System.out.print(q.printfront()+ ",");
		q.dequeue();
		System.out.println(q.printfront());
		q.dequeue();

		System.out.println("");

		System.out.println("Stack to Stack:");
		s.push(1);
		s2.push(s.peek());
		s.push(2);
		s2.push(s.peek());
		s.push(3);
		s2.push(s.peek());
		s.push(4);
		s2.push(s.peek());
		s.push(5);
		s2.push(s.peek());

		System.out.println("\nStack 1: pop and print:");

		System.out.print(s.pop() + ",");
		System.out.print(s.pop()+ ",");
		System.out.print(s.pop()+ ",");
		System.out.print(s.pop()+ ",");
		System.out.println(s.pop());


		System.out.println("\nStack 2: pop and print:");
		System.out.print(s2.pop() + ",");
		System.out.print(s2.pop()+ ",");
		System.out.print(s2.pop()+ ",");
		System.out.print(s2.pop()+ ",");
		System.out.println(s2.pop());
	}

}
