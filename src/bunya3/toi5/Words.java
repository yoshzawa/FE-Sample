package bunya3.toi5;

import java.util.Arrays;

public class Words {

	String[] data = {};

	int freq(String str) {
		return Arrays.stream(data).mapToInt(s -> freq(s, str)).sum();
	}

	int freq(String data, String str) {
		int before = data.length();
		int after = data.replace(str, "").length();
		return (before - after) / str.length();
	}

	int freqE(String str) {
		return Arrays.stream(data).mapToInt(s -> freqE(s, str)).sum();
	}

	int freqE(String data, String str) {
		return data.endsWith(str) ? 1 : 0;
	}

}
