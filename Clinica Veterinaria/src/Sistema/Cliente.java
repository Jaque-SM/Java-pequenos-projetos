package Sistema;
import java.util.Scanner;

public class Cliente {

	private String nomeCliente;
	private String enderecoCliente;
	private long cepCliente;
	private String telefoneCliente;
	private String emailCliente;
	
	
	public Cliente() {
		
	}
	
	public Cliente(String nomeCliente, String enderecoCliente, String telefoneCliente,
			String emailCliente) {
		
		this.nomeCliente = nomeCliente;
		this.enderecoCliente = enderecoCliente;
		this.cepCliente = cepCliente;
		this.telefoneCliente = telefoneCliente;
		this.emailCliente = emailCliente;
	}


	public String getNomeCliente() {
		return nomeCliente; 	
		
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public long getCepCliente() {
		return cepCliente;
	}
	public void setCepCliente(long cepCliente) {
		this.cepCliente = cepCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	
	
	public int registrarCliente() {
	
		Cliente c=new Cliente();
		
if (c.getNomeCliente()!=null&&c.getEnderecoCliente()!=null&&c.getEmailCliente()!=null&&
	c.getTelefoneCliente()!=null&&c.getCepCliente()!=0) {
			return 1;
		}
		
		return  0;

	}
	
	public String consultarCliente() {
		
		String ver = this.getNomeCliente() + "\n ";
		
		ver += this.getEnderecoCliente()+"\n ";
		ver += this.getCepCliente()+"\n";
		ver += this.getTelefoneCliente()+"\n";
		ver += this.getEmailCliente()+"\n";
		ver+=this.getCepCliente()+"\n";
		
		return ver;
	}
	
}
