package br.com.paula.threads.numeros;


public class TarefaImprimeNumeros implements Runnable {

	@Override
	public void run() {
		
		Thread threadAtual = Thread.currentThread();
		long id = threadAtual.getId();
		 
		for (int i = 1; i <= 1000; i++) {
			System.out.println("Thread ==========>"+ id +"  ---------- número = "+ i);
		}

	}

}
