package view;

import javax.swing.JOptionPane;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		FatorialController fatorialController = new FatorialController();
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int resultado = fatorialController.Fatorial(n);
		System.out.println("O fatorial de " + n + " é igual a: " + resultado);
	}

}
