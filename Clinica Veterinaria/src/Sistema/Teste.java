package Sistema;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teste {

	public  static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("******SISTEMA VETERINÁRIO********");
		
		Cliente c=new Cliente();
		 
		//pedindo os dados dentro do obj
		System.out.print("\n Informe o nome do cliente: \n");
		c.setNomeCliente(s.nextLine());
		System.out.print("\n Informe o endereço: \n");
		c.setEnderecoCliente(s.nextLine());
		System.out.print("\n Informe o email: \n");
		c.setEmailCliente(s.nextLine());
		System.out.print("\n Informe o telefone: \n");
		c.setTelefoneCliente(s.nextLine());
		System.out.print("\n Informe o cep do cliente: \n");
		c.setCepCliente(s.nextLong());
		
		//chamando os metodos
		System.out.print("\n Retorno: "+c.registrarCliente());
		
		System.out.print("\n*******DADOS CADASTRADOS********");
		System.out.print("\n"+c.consultarCliente());
		
		System.out.print("\n******FICHA DO ANIMAL*******");
		
		Animal a=new Animal ();
		
		System.out.print("\n Informe o nome do animal: \n");
		a.setNomeAnimal(s.next());
		System.out.print("\n Informe a idade do animal: \n");
		a.setIdadeAnimal(s.nextInt());
		System.out.print("\n Informe o genêro do animal: 1 para fêmea/ 2 para machõ\n");
		a.setSexoAnimal(s.nextInt());
		
		if (a.getSexoAnimal()==1||a.getSexoAnimal()==2){
			System.out.print("\n Genero cadastrado!");
			
		}
		
		System.out.print("\nRetorno: "+a.RegistrarAnimal());
		
		System.out.print("\n********ANIMAIS CADASTRADOS******");
		System.out.print("\n"+a.listarAnimal());
		
		System.out.print("\n*******CONSULTA*******");		
		System.out.print("\n"+a.consultar());
		
		System.out.print("\n******TRATAMENTO*****");
		
		Tratamento t=new Tratamento();
		
		System.out.print("\n Informe a data que deseja iniciar o tratamento: ");
		
		
		System.out.print("\nDATA: "+t.registrarTratamento());
		
		
		System.out.print("\n*****MARCAR CONSULTA*******");
		Consulta a1=new Consulta();
	 
		System.out.print("\n Informe o relato da consulta:");
		a1.setRelatoConsulta("\n"+s.next());
	 
		System.out.print("\n"+a1.registrarConsulta());
	 
		System.out.print("\n"+a1.listarConsulta());
	
		
		
	}
	
	
	
}
