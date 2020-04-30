package br.com.paula.threads.banheiroSujo;

public class TarefaIrNoBanheiroNumero1 implements Runnable {

	private Banheiro banheiro;

	public TarefaIrNoBanheiroNumero1(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		this.banheiro.fazNumero1();
	}

}
