package practice;

import java.util.Scanner;

class Main {

	private int size = 5;
	private int top = -1;
	private int[] stack = new int[size];

	public void push(int element) {
		if (isFull(size - 1, top)) {
			System.out.println("Overflow");
		} else {
			top++;
			stack[top] = element;
		}
	}

	public void pop() {

		if (isEmpty()) {
			System.out.println("Already empty");
		} else {
			top--;
		}
	}

	public void peek() {
		System.out.println(stack[top]);

	}

	public boolean isEmpty() {

		if (top == -1) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isFull(int size, int top) {

		if (top == size) {
			return true;
		} else {
			return false;
		}

	}

}

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Main sk = new Main();

		int option = 0;
		int element = 0;
		while (true) {
			System.out.println("1 : Adding Element");
			System.out.println("2 : Delete Element");
			System.out.println("3 : Display Top Element");
			System.out.println("4 : Exit");
			option = sc.nextInt();

			if (option == 1) {
				System.out.println("Enter element");
				element = sc.nextInt();
				sk.push(element);
			} else if (option == 2) {
				sk.pop();

			} else if (option == 3) {
				sk.peek();

			} else if (option == 4) {
				break;

			} else {
				System.out.println("Wrong option");
			}
		}

	}
}
