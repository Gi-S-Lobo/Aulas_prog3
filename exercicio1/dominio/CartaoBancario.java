package dominio;

import controle.Pagamento;

public class CartaoBancario implements Pagamento{

	@Override
	public void realizarPagamento(double valor) {
		System.out.printf("Pagamento de R$ %.2f realizado com Cartão de Crédito.\n", valor);
		
	}

}
