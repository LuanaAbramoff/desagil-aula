package br.edu.insper.desagil.aula2;

public class Calculadora {

	public double executa(int a, int b, char op) {
		
		if (op == '+') {
			return a+b;
		}
		
		else if (op == '-') {
			return a-b;
			
		}
		
		else if (op == '*') {
			return a*b;
		}
		
		else if (op== '/' && b!=0)  {
			return (double)a/b;
		}
		
		else if (b == 0) {
			return 0.0;
		}
		
		else {
			return 0.0;
		}
		
	}

}
