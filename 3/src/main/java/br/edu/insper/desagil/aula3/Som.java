package br.edu.insper.desagil.aula3;

import java.util.List;

public class Som {

	public void clip(List<Integer> onda, int limite) {
		
		for (int i=0; i<onda.size();i++) {
			if (onda.get(i)>limite) {
				onda.set(i, limite);
			}
			else if(onda.get(i)<(-limite)) {
				onda.set(i,(-limite));
			}
		}
		

		
	}

}
