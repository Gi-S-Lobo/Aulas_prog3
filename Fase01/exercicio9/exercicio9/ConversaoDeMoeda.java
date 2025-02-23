package exercicio9;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;
import java.util.Scanner;

import org.json.JSONObject;
/*	biblioteca exportada 	*/

public class ConversaoDeMoeda 
{	
	/*
		 9. Conversão de Moeda
		Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia. 
		O programa deve calcular e exibir o valor equivalente em dólares (US$).
	*/
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.out.println("CONVERSÃO DE MOEDA");
	
	/*
	 	//Moeda em tempo real
	
		String chaveApi = "2476e5edd80e939c4c09448d";
        	String url = "https://v6.exchangerate-api.com/v6/" + chaveApi + "/latest/BRL";
        
       		HttpClient cliente = HttpClient.newHttpClient();
       		HttpRequest pedido = HttpRequest.newBuilder().uri(URI.create(url)).build();
       	
       		HttpResponse<String> resposta = cliente.send(pedido, HttpResponse.BodyHandlers.ofString());
        
        	Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Digite o valor em reais:");
			double real = sc.nextDouble();
			
		//Verificando o status da chave de API
		 
		if (resposta.statusCode() == 200) 
       	{
            String respostaJson = resposta.body();
            JSONObject objetoJson = new JSONObject(respostaJson);

            double taxaDeCambio = objetoJson.getJSONObject("conversion_rates").getDouble("USD");

            double valorUSD = real*taxaDeCambio;
            
            System.out.println(taxaDeCambio);
            
            System.out.println(" R$"+ df.format(real) +" é equivalente a US$"+ df.format(valorUSD));
        } 
       	else 
       	{
            System.out.println("Erro ao obter os dados da API. Código de status: " + resposta.statusCode());
        } 
	*/
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
			
		System.out.print("Digite o valor em reais:");
			double real = sc.nextDouble();
		
		double valorUSD = real/5.73;
		
		System.out.println("R$"+ df.format(real) +" BRL é equivalente a "+ df.format(valorUSD) +"USD\n");
	}
}
