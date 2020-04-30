package br.com.paula.threads.bancoDados;

public class Principal {

	public static void main(String[] args) {

		GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
		PoolDeConexao pool = new PoolDeConexao();
		
		new Thread(new TarefaAcessaBanco(pool, tx)).start();
		new Thread(new TarefaAcessaBancoProcedimento(pool, tx)).start();

	}
}
