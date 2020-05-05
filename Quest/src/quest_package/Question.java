package quest_package;

import java.util.Scanner;

public class Question {
	public Question() {
		System.out.print("Type: ");
		Scanner input = new Scanner(System.in);
		String inputs = input.nextLine();
		input.close();
		new Vocab(inputs);
	}
}
