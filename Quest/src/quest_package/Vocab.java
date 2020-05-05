package quest_package;

import java.util.HashMap;

public class Vocab {

	public Vocab(String main_input) {

		String[] array = main_input.split(" ");

		HashMap<String, String> dir = new HashMap<String, String>();
		dir.put("hello", "Hi there");
		dir.put("who", "I'm Quest, a computer that can't really think for itself.");
		dir.put("hate", "I'm sorry you feel that way.");
		dir.put("sad", "I wish I could help");
		dir.put("age", "I'm in version 1.0.0");
		dir.put("old", "I'm in version 1.0.0");
		dir.put("angry", "Calm down");
		dir.put("think", "I sadly cannot think. I am just a program that find words I know");
		dir.put("hi", "Hello my friend!!!");
		dir.put("code", "I cannot code, but I have about 14 lines of vocab.");
		dir.put("mean", "I wish that could change.");
		dir.put("bullying", "Mean people do not deserve life.");
		dir.put("worried", "I sure if will turn out fine.");
		dir.put("scared", "Listen to me. Everything will be all right");
		dir.put("upset", "I wish I could help you in another form that words");
		dir.put("wrong", "Sorry, I have a limeted words and only know them in one context.");
		dir.put("great", "Thanks! I like you too!");
		dir.put("bye", "Bye! See you later!!");
		dir.put("go", "Okay, C Ya!");

		for (String input : array) {
			String inputLower = input.toLowerCase();
			forloops: for (String ikeys : dir.keySet()) {
				if (ikeys.equals(inputLower)) {
					System.out.println(dir.get(inputLower));
					break forloops;
				} else {

				}
			}
		}
	}
}
