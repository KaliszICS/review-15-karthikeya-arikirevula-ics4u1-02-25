public class PracticeProblem {

	public static void main(String args[]) {

	}


	public static int goodString(String string) {
		int f = string.length();

		//good string check
		if (f >= 2 && string.charAt(0) == string.charAt(f - 1)) {
			return 0;
		}

		if (f < 2) {
			return -1;
		}

		int smallOpp = Integer.MAX_VALUE;

		//try to make goodstring
		for (int i = 0; i < f; i++) {
			for (int j = f - 1; j>= i; j--) {
				if (i < j && string.charAt(i) == string.charAt(j)) {
					int opp = i + (f - 1 - j);

					smallOpp = Math.min(smallOpp, opp);
				}
			}

		}

		//no goodstring can be formed
		if (smallOpp == Integer.MAX_VALUE) {
			return -1;
		}

		return smallOpp;
    }
}