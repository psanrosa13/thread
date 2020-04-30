package br.com.paula.threads.buscador;

public class BuscaNome {

	public static void main(String[] args) {
		String nomeProcurado = "Jon";

	    Thread threadAutores = new Thread(new TarefaBuscaNome("autores.txt",
	            nomeProcurado));
	    Thread threadAssinaturas1 = new Thread(new TarefaBuscaNome(
	            "assinaturas1.txt", nomeProcurado));
	    Thread threadAssinaturas2 = new Thread(new TarefaBuscaNome(
	            "assinaturas2.txt", nomeProcurado));

	    threadAutores.start();
        threadAssinaturas1.start();
        threadAssinaturas2.start();
	}

}
