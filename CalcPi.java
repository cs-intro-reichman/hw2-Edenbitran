// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {

		System.out.println("pi according to Java: " + Math.PI);
		double number = Double.parseDouble(args[0]);
		double nn = 1;// nn=new number
		double count = 1;

		for (int i = 1; i < number; i++) {
			if (i % 2 == 0) {
				count += 2;
				nn += (double) (1 / count);
			}
			if (i % 2 != 0) {
				count += 2;
				nn -= (double) (1 / count);
			}
		}
		nn *= 4;

		System.out.println("pi, approximated:     " + nn);
	}
}