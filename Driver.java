
public class Driver {
	
	public static void print(Polynomial s) {
		System.out.print("Coefficients = [");
		for (int i = 0; i < s.coefficients.length; i++) {
			System.out.print(s.coefficients[i] + ", ");
		}
		System.out.println("]");
		
		System.out.print("Exponents = [");
		for (int i = 0; i < s.exponents.length; i++) {
			System.out.print(s.exponents[i] + ", ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		
		double c1[] = {6, -2, 5};
		int e1[] = {0, 1, 3};
		Polynomial p1 = new Polynomial(c1, e1);
		
		double c2[] = {5, -3, 7};
		int e2[] = {1, 2, 8};
		Polynomial p2 = new Polynomial(c2, e2);
		
		Polynomial s = p1.add(p2);
		print(s);
		
		System.out.println("s(2) = " + s.evaluate(2));
		
		Polynomial y = p1.multiply(p2);
		print(y);
		
		if (s.hasRoot(1)) {
			System.out.println("1 is a root of s");
		} else {
			System.out.println("1 is not a root of s");
		}
	}
}