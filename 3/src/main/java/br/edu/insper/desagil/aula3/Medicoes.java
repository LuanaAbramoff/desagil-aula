package br.edu.insper.desagil.aula3;

import java.util.Map;

public class Medicoes {

	public void normaliza(Map<Integer, Double> medicoes) {
		
		int soma=0;
		for (double v : medicoes.values()) {
		    soma+=v;
		}
		
		for (int k : medicoes.keySet()) {
			medicoes.put(k, medicoes.get(k)/soma);
		}
		
	}

}
