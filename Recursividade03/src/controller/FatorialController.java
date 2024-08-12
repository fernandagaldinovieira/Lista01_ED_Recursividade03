package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}

	public int Fatorial(int n) {
		//Condição de parada: se n for igual a 0 ou 1, então o fatorial é 1
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * Fatorial(n - 1);
		}
	}
}
