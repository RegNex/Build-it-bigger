package com.example.android.jokeprovider;


public class JokeProvider {
	public static String getJoke() {
		String[] objects = {"How can Santa deliver presents during a thunderstorm? \n\n His sleigh is flown by raindeer",
				"What is a mountain's favorite type of candy? \n\n Snow caps",
				"What do you call dangerous precipitation? \n\n A rain of terror",
				"Where do lightning bolts go on dates? \n\n To Cloud 9"};

		int length = objects.length;
		int rand = (int) (Math.random() * length);

		return objects[rand];
	}
}
