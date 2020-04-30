package br.com.paula.threads.banheiroSujo;

public class FilaDoBanheiroNaFesta {

	public static void main(String[] args) {
		Banheiro banheiro = new Banheiro();

		Thread convidado1 = new Thread(new TarefaIrNoBanheiroNumero1(banheiro), "João");
		Thread convidado2 = new Thread(new TarefaIrNoBanheiroNumero2(banheiro), "Pedro");
		Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Limpeza");
		limpeza.setDaemon(true);

		limpeza.start();
		convidado1.start();
		convidado2.start();

	}

}
