package entities;

public class TesteObj_03 {
	public float a;
	public float b;
	
	public float _Desconto() {
		float c = a + b;
		float Resultado_c;
		if (c > 200 && c < 499) {
			// primeiro desc 5%
			Resultado_c = (float) (c - (c * 0.05));
		} else if (c >= 500 && c < 1000) {
			// segundo Desc 10%
			Resultado_c = (float) (c - (c * 0.10));

		} else if (c >= 1000 && c < 2000) {
			// terceiro Desc 15%
			Resultado_c = (float) (c - (c * 0.15));

		} else {
			// quarto desc 20%
			Resultado_c = (float) (c - (c * 0.20));
		}
		return Resultado_c;
	}

}
