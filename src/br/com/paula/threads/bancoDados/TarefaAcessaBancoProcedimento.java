package br.com.paula.threads.bancoDados;

public class TarefaAcessaBancoProcedimento implements Runnable {

	private PoolDeConexao pool;
    private GerenciadorDeTransacao tx;

    public TarefaAcessaBancoProcedimento(PoolDeConexao pool,
            GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }
    
	@Override
	public void run() {
		synchronized (pool) {  //primeiro pool

		    System.out.println("Peguei a chave do pool");
		    pool.getConnection();

		    synchronized (tx) { 

		        System.out.println("Peguei a chave da tx");
		        tx.begin();
		    }
		}

	}

}
