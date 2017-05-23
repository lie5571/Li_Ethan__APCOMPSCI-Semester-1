/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	public static void perfectShuffle(int[] values) {
		int[] shuffled = new int[values.length];
		int half = (values.length + 1) / 2;
		int k = 0;
		for (int j = 0; j < half; j++) {
			shuffled[k] = values[j];
			k += 2;
		}
		k = 1;
		for (int j = half; j < values.length; j++) {
			shuffled[k] = values[j];
			k += 2;
		}
		for (int i = 0; i < values.length; i++) {
			values[i] = shuffled[i];
		}
	}
	public static void selectionShuffle(int[] values) {
		for(int h = 0; h < values.length; h++) {
			int j = (int)(Math.random() * (h+1));
			int shuffled = values[j];
			values[j] = values[h];
			values[h] = shuffled;
		}
	}
}
