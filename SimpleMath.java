package Cushman.Zachary.Chapter6.Java.Project;

public class SimpleMath {
	public double divide(double num, double den) {
		if(den == 0) {
			throw new ArithmeticException();
		}
		return num/den;
	}
	
	public double multiply(double num1, double num2) {
		return num1 * num2;
	}
}
