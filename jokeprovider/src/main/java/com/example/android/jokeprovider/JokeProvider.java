package com.example.android.jokeprovider;

import java.util.Random;

public class JokeProvider {
	private Random random = new Random();
	private String[] awesomeJokes =
			{"How can Santa deliver presents during a thunderstorm? \n His sleigh is flown by raindeer",
					"What is a mountain's favorite type of candy? \n Snow caps",
					"What do you call dangerous precipitation? \n A rain of terror",
					"Where do lightning bolts go on dates? \n To Cloud 9"};

	//https://stackoverflow.com/questions/5887709/getting-random-numbers-in-java
	public String getJoke() {
		if (random == null) {
			random = new Random();
		}
		return awesomeJokes[random.nextInt(3)];
	}
}
