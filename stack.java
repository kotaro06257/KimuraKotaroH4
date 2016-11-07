package homework4;

public class stack {

	int maxsize = 100;
	int[] stackarray = new int[maxsize];
	int top = -1;

	public void push(int a) {

		if (top + 1 >= maxsize) {

		} else {
			stackarray[++top] = a;
		}
	}

	public int pop() {

		return stackarray[top--];

	}

	public int peek() {

		return stackarray[top];

	}

	void top() {
		System.out.println("Top of stack is " + stackarray[top]);
	}

	public void print() {

		for (int i = 0; i <= top; i++) {
			System.out.print(stackarray[i] + ",");

		}

	}

}
