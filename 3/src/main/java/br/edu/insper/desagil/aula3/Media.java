package br.edu.insper.desagil.aula3;

import java.util.List;

public class Media {

	public double calcula(List<Integer> numeros) {
		double s = 0;

		for (int n : numeros) {
			s += n / numeros.size();
		}

		return s;
	}

}
