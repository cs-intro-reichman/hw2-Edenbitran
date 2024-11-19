// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		String mood = args[1];

		if (mood.charAt(0) == 'c') {
			System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
		}
		if (mood.charAt(0) == 'v') {
			System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");

			for (int i = 1; i <= number; i++) {
				int num = i;
				String str = i + " ";
				int count = 0;

				if (num % 2 == 0) {
					num /= 2;
					count++;
					str += num + " ";
				} else {
					num = (num * 3) + 1;
					count++;
					str += num + " ";
				}

				while (num != 1) {
					if (num % 2 == 0) {
						num /= 2;
						count++;
						str += num + " ";
					} else {
						num = (num * 3) + 1;
						count++;
						str += num + " ";
					}
				}
				count++;
				System.out.println(str + "(" + count + ")");
				if (i == number) {
					System.out.println("Every one of the first " + number + " hailstone sequences  reached 1. ");
				}

			}
		}
	}
}