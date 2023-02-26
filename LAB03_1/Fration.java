package LAB03_1;

public class Fration {
	private int numerator;
	private int denominator;

	public Fration() {
		this.denominator = 1;
		this.numerator = 0;
	}

	public Fration(int num, int den) {
		if (den == 0) {
			System.out.println("Nhập mẫu số khác 0");
			this.denominator = 1;
			this.numerator = 0;
		} else {
			this.denominator = den;
			this.numerator = num;
		}
	}

	public Fration(Fration f) {
		this.denominator = f.denominator;
		this.numerator = f.numerator;
	}

	public Fration add(Fration f) {
		int a = this.numerator * f.denominator + this.denominator * f.numerator;
		int b = this.denominator * f.denominator;
		return new Fration(a, b);
	}

	public Fration sub(Fration f) {
		int a = this.numerator * f.denominator - this.denominator * f.numerator;
		int b = this.denominator * f.denominator;
		return new Fration(a, b);
	}

	public Fration mul(Fration f) {
		int a = this.numerator * f.numerator;
		int b = this.denominator * f.denominator;
		return new Fration(a, b);
	}

	public Fration div(Fration f) {
		int a = this.numerator * f.denominator;
		int b = this.denominator * f.numerator;
		return new Fration(a, b);
	}

	public void reducer() {
		int a = this.numerator;
		int b = this.denominator;
		if (a == 0 || b == 0) {
			a = a + b;
		} else {
			while (a != b) {
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			}
		}
		int ucln = a;
		this.numerator = this.numerator / ucln;
		this.denominator = this.denominator / ucln;
	}

	public String toString() {
		return ("Fration [num = " + this.numerator + ", den = +" + this.denominator + "]");
	}
}
