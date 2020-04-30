package br.com.paula.threads.banheiro;

public class FilaDoBanheiroNaFesta {

	public static void main(String[] args) {
		Banheiro banheiro = new Banheiro();
		
        Thread convidado1 = new Thread(new TarefaIrNoBanheiroNumero1(banheiro), "João");
        Thread convidado2 = new Thread(new TarefaIrNoBanheiroNumero2(banheiro), "Pedro");

        convidado1.start();
        convidado2.start();
		
	}

}
