package dominio;

import java.text.DecimalFormat;

public class CaixaEletronico {
		
		DecimalFormat df = new DecimalFormat("#.00");
	
		private double saldo;
		
		public CaixaEletronico(double saldo) {
			this.saldo = saldo;
		}
		
		public boolean sacar(double valor) {
	        if (valor % 10 != 0) {
	            System.out.println("Valor inválido! O saque deve ser em múltiplos de R$ 10.");
	            return false;
	        }
	        
	        if (valor > saldo) {
	            System.out.println("Saldo insuficiente!");
	            return false;
	        }
	        
	        saldo -= valor;
	        System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
	        return true;
	    }
		
		public void exibirSaldo() {
			System.out.println("Saldo atual: " +  df.format(saldo));
			
		}
		
}
