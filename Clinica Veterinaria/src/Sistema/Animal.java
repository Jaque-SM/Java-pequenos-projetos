package Sistema;
import java.util.Scanner;

import javax.xml.soap.Node;

public class Animal  {
	
	private String nomeAnimal;
	private int idadeAnimal;
	private int sexoAnimal;
	
	Scanner s = new Scanner(System.in); 
	
	Especie e=new Especie();
	
	public Animal(String nomeAnimal, int idadeAnimal, int sexoAnimal) {
		
		this.nomeAnimal = nomeAnimal;
		this.idadeAnimal = idadeAnimal;
		this.sexoAnimal = sexoAnimal;
	}
	public Animal() {
		
		
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public int getSexoAnimal() {
		return sexoAnimal;
	}

	public void setSexoAnimal(int sexoAnimal) {
		this.sexoAnimal = sexoAnimal;
	}
	
	public int RegistrarAnimal() {
		
		Animal a=new Animal();
		
	if (a.getNomeAnimal()!=null&a.getIdadeAnimal()!=0&&a.getSexoAnimal()!=0) {
		this.nomeAnimal=a.getNomeAnimal();
		this.idadeAnimal=a.getIdadeAnimal();
		this.sexoAnimal=a.getSexoAnimal();
		return 1;
	}
	
		return 0;
	}
	public String listarAnimal() {
		
		String b=this.getNomeAnimal()+"\n";
		b+=this.getIdadeAnimal()+"\n";
		b+=this.getSexoAnimal()+"\n";
		
		return b;
	}
	public String consultar() {
		Animal a=new Animal ();
		
		if (this.nomeAnimal.equals(getNomeAnimal())) {
		String s=this.getNomeAnimal()+"\n";
		s+=this.getIdadeAnimal()+"\n";
		s+=this.getSexoAnimal()+"\n";
		
		return s;
	}
		return "nome invalido";
}
}
