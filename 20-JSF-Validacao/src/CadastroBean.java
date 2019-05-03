import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class CadastroBean {

	private String nome;
	private long cpf;
	private int idade;
		
	public void qualquer() {}
	public void validar(FacesContext context, UIComponent component, Object value)throws ValidatorException {
		String valor = value.toString();
		if(valor.contains("@") || valor.contains("#") || valor.contains("\'")) {
			throw new ValidatorException(new FacesMessage("Nome não deve ter @, # ou \'")); 
		}
	}
	
	public CadastroBean() {
		super();
	}
	public CadastroBean(String nome, long cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
