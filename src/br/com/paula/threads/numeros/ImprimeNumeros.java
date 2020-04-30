package br.com.paula.threads.numeros;

public class ImprimeNumeros {
	public static void main(String[] args) {
		
		Thread threadUm = new Thread(new TarefaImprimeNumeros());
		
		Thread threadDois = new Thread(new TarefaImprimeNumeros());
		
		threadUm.start();
		threadDois.start();
		
	}
}
