package br.com.paula.threads.list;

import java.util.List;


public class TarefaAdicionarElemento implements Runnable {

	private List<String> lista;

	private int numeroDoThread;

	public TarefaAdicionarElemento(List<String> lista, int numeroDoThread) {
		this.lista = lista;
		this.numeroDoThread = numeroDoThread;
	}

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			lista.add("Thread " + numeroDoThread + " - " + i);
		}

	}

}
