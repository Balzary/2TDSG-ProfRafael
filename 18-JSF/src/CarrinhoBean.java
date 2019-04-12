import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarrinhoBean {	
	
	private List<String> listaSelecionados;
	private String quantidade;
	private String pagamento;	
	
	
	public void comprar() {
		for(String valor : listaSelecionados) {
			System.out.println(valor);
		}
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println("Forma de pagamento: " + getPagamento());
	}
	
	public List<Forma> getFormasPagamento(){
		List<Forma> formas = new ArrayList<Forma>();
		formas.add(new Forma("Crédito", 1));
		formas.add(new Forma("Débito", 2));
		formas.add(new Forma("Boleto", 3));
		return formas;
	}
	
	public List<Produto> getProdutos(){
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto(1,"Notebook Acer"));
		produtos.add(new Produto(2,"Celular HiPhone"));
		produtos.add(new Produto(3,"Teclado Razer"));
		return produtos;
	}
	
	
	public CarrinhoBean() {
		super();
	}
	
	public CarrinhoBean(List<String> listaSelecionados, String quantidade) {
		super();
		this.listaSelecionados = listaSelecionados;
		this.quantidade = quantidade;
	}

	public List<String> getListaSelecionados() {
		return listaSelecionados;
	}


	public void setListaSelecionados(List<String> listaSelecionados) {
		this.listaSelecionados = listaSelecionados;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}	

	
	
	
}
