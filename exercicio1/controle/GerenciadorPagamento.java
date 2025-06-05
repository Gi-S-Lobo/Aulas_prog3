package controle;
import dominio.BoletoBancario;
import dominio.CartaoBancario;
import java.util.Scanner;

public class GerenciadorPagamento {
	
       	public static void main(String[] args) {
		
       		Scanner s = new Scanner(System.in);
	
       		Pagamento cartao = new CartaoBancario();
       		Pagamento boleto = new BoletoBancario();
        
       		System.out.print("Digite o valor do pagamento: R$ ");
            double valor = s.nextDouble();
            
            int opcao;
            do {
                System.out.println("\n=== FORMAS DE PAGAMENTO ===");
                System.out.println("1 - Cartão de Crédito");
                System.out.println("2 - Boleto Bancário");
                System.out.println("0 - Cancelar");
                System.out.print("Escolha a forma de pagamento: ");
                
                opcao = s.nextInt();
                
                Pagamento formaPagamento = null;
                
                switch(opcao) {
                    case 1:
                        formaPagamento = cartao;
                        break;
                    case 2:
                        formaPagamento = boleto;
                        break;
                    case 0:
                        System.out.println("\nOperação cancelada pelo usuário.");
                        break;
                    default:
                        System.out.println("\nOpção inválida! Tente novamente.");
                }
                
                if(formaPagamento != null) {
                    formaPagamento.realizarPagamento(valor);
                    break;
                }
                
            } while(opcao != 0);
            
            s.close();
   
       	}
}


