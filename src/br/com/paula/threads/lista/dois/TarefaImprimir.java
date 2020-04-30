package br.com.paula.threads.lista.dois;

public class TarefaImprimir implements Runnable {

	private Lista lista;

	public TarefaImprimir(Lista lista) {
		this.lista = lista;
	}

	@Override
	public void run() {
		
		// se eu uso como chave a lista então preciso solicitar a espera para a lista e não para a minha classe atual
		synchronized (lista) { 
			if(!lista.estaCheia()) { 
                try {
                    System.out.println("esperando, aguardando notificacao");
                    lista.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < lista.tamanho(); i++) {
                System.out.println(i + " - " + lista.pegaElemento(i));
            }
        }
	}

}
