package br.com.fiap.loja;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.apache.log4j.Logger;

import br.com.fiap.loja.bo.EstoqueBO;
import br.com.fiap.loja.to.ProdutoTO;
import br.com.fiap.singleton.PropertySingleton;

public class TerminalConsulta {
	private static Logger log = Logger.getLogger(TerminalConsulta.class);

	public static void main(String[] args) {
		log.warn("Início da Aplicação");
		String nome = PropertySingleton.getInstance().getProperty("nome");
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(nome + " " + hoje.format(formatador));
		System.out.println("Digite o código do produto desejado: ");
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		sc.close();		
		
		ProdutoTO produto = EstoqueBO.consultarProduto(codigo);
		System.out.println(produto.getDescricao());
		
		log.warn("Final da Aplicação");
	}
	
	

}