package br.com.fiap.loja.bo;

import org.apache.log4j.Logger;

import br.com.fiap.loja.to.ProdutoTO;

public class EstoqueBO {
	
	private static Logger log = Logger.getLogger(EstoqueBO.class);

		public static ProdutoTO consultarProduto(int codigo) {
			
			switch (codigo) {
				case 401:
					log.debug(codigo + " - " + "Camiseta branca");
					return new ProdutoTO(codigo,"Camiseta branca",4, 9.99);
					
				case 402:
					log.debug(codigo + " - " + "Camiseta azul");
					return new ProdutoTO(codigo,"Camiseta azul",4, 9.99);
					
				case 403:
					log.debug(codigo + " - " + "Camiseta rosa");
					return new ProdutoTO(codigo,"Camiseta rosa",4, 9.99);
					
				default:
					log.error("código incorreto");
					return new ProdutoTO(-1,"Produto não encontrado", 0, 0);						
		}
			
			

	}
	
}
