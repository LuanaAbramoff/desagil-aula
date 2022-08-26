package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.List;

public class Divisores {

	public List<Integer> calcula(int n) {
		
		List<Integer> l = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			if (n%i==0) {
				l.add(i);
			}
		}
		
		return l;
	}

}
