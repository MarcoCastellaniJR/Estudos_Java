package entities;

public class TesteMaior {
	public double a;
	public double b;
	public double c;
	public double d;

	public double Testando() {
		double s;
		if (a > b && a > c && a > d) {
			s = a;
		} else if ( b > c && b > d) {
			s = b;
		} else if (c > d) {
			s = c;
		}else {
			s = d;
		}
		//double s = (a + b) * (c + d);
		return s;
	}
	
}
