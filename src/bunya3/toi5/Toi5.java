package bunya3.toi5;

public class Toi5 {
	static Words words;

	public static void main(String[] s) {
		words = new Words();
		String[] data ={"importance","inflation","information","innovation"};
		words.data=data;
		System.out.println(prob('n', 'f'));
	}
	
	static double prob(char c1, char c2) {
		String s1 = c1 + "";
		String s2 = c2 + "";
		if (words.freq(s1 + s2) > 0) {
			return ans(s1, s2);
		} else {
			return 0;
		}
	}

	static double ans(String s1, String s2) {
		throw new RuntimeException();
	}

	static double ans_a(String s1, String s2) {
		double numerator = words.freq(s1) - words.freqE(s1);
		int denominator = words.freq(s1 + s2);
		return numerator / denominator;
	}

	static double ans_i(String s1, String s2) {
		double numerator = words.freq(s2) - words.freqE(s2);
		int denominator = words.freq(s1 + s2);
		return numerator / denominator;
	}

	static double ans_u(String s1, String s2) {
		double numerator = words.freq(s1 + s2);
		int denominator = words.freq(s1) - words.freqE(s1);
		return numerator / denominator;
	}

	static double ans_e(String s1, String s2) {
		double numerator = words.freq(s1 + s2);
		int denominator = words.freq(s1) - words.freqE(s1);
		return numerator / denominator;
	}
}
