package br.edu.insper.desagil.aula2;

public class Tabuada {

	int n = 13;
	String a = "";
	String ultima = "";

	while (n/2!=1) {
		a+= Integer.toString(n%2);
		n = n/2;
		
	}
	
	for (int i=0;i<=a.length();i++) {
		ultima+=a.charAt(a.length()-i);
	

		
	}

}
