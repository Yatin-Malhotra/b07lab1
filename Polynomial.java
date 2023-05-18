public class Polynomial {
	
	double coefficients[];
	
	public Polynomial() {
		coefficients = new double[1];
		coefficients[0] = 0;
	}
	
	public Polynomial(double given_coefficients[]) {
		coefficients = given_coefficients;
	}
	
	public Polynomial add(Polynomial otherPoly) {
		int lengthOurPoly = coefficients.length;
		int lengthOtherPoly = otherPoly.coefficients.length;
		if (lengthOurPoly > lengthOtherPoly) {
			double new_coeff[] = new double[lengthOurPoly];
			for (int i = 0; i < lengthOtherPoly; i++) {
				new_coeff[i] = coefficients[i] + otherPoly.coefficients[i];
			}
			for (int i = lengthOtherPoly; i < lengthOurPoly; i++) {
				new_coeff[i] = coefficients[i];
			}
			Polynomial p = new Polynomial(new_coeff);
			return p;
		} else {
			double new_coeff[] = new double[lengthOtherPoly];
			for (int i = 0; i < lengthOurPoly; i++) {
				new_coeff[i] = coefficients[i] + otherPoly.coefficients[i];
			}
			for (int i = lengthOurPoly; i < lengthOtherPoly; i++) {
				new_coeff[i] = otherPoly.coefficients[i];
			}
			Polynomial p = new Polynomial(new_coeff);
			return p;
		}
	}
	
	public double evaluate(double x) {
		double sum = coefficients[0];
		for (int i = 1; i < coefficients.length; i++) {
			sum += (coefficients[i] * Math.pow(x, i));
		}
		return sum;
	}
	
	public boolean hasRoot(double val) {
		if (evaluate(val) == 0) {
			return true;
		}
		return false;
	}
}