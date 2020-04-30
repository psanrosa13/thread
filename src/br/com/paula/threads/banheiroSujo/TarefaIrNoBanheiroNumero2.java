package br.com.paula.threads.banheiroSujo;

public class TarefaIrNoBanheiroNumero2 implements Runnable {

	private Banheiro banheiro;

	public TarefaIrNoBanheiroNumero2(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		this.banheiro.fazNumero2();
	}

}
