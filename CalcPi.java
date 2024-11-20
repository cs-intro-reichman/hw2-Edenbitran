// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + sqrt(Double.parseDouble(args[0])));
	}

	public static double sqrt(double number) {
		double p = Math.PI;
		double epsilon = 1 / number;
		double increment = 0.0001;
		double sn = 1;// sn- sqrt number
		while ((Math.abs(sn * sn - p) >= epsilon) && (sn <= p)) {
			sn += increment;
		}
		return sn * sn;
	}
}