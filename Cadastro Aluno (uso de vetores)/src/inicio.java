

import java.util.Scanner;

public class inicio {
	
	public static void main (String args[]) {
		
		
		Scanner ler = new Scanner(System.in);
		
		String nome[]=new String [3];
		
		int idade[]=new int [3];
		
		int matricula[]=new int [3];
		
		int i;
		
		float altura[]=new float [3];
		
		float media = 0, soma=0;
		
		Aluno registro=new Aluno();
		
		for (i=0; i<3; i++) {
		System.out.printf(" Informe a matricula do aluno %d ", i);
		matricula[i]=ler.nextInt();
		
		System.out.printf("\nInforme o nome do aluno %d: ", i);
		nome[i]=ler.next();
		
		System.out.printf("\nInforme a idade do aluno %d: ", i);
		idade[i]=ler.nextInt();
		
		System.out.printf("\n Informe a altura  %d: ", i);
		altura[i]=ler.nextFloat();
		
	}
		for (i=0; i<3; i++) {	
			soma+=altura[i];
			media=soma/3;
		}
		System.out.printf("\n  A media de altura é : %.2f", media);
		
		for (i=0; i<3; i++) {
		if(idade[i]>13) {
			
		for (i=0; i<3; i++) {
			if (altura[i]<media) {
		System.out.printf("\n Os alunos com altura inferior a media sao: \n[%d]%s com altura %.2f",i, nome[i], altura[i]);
		}
	}
	
	}

		else {
			System.out.printf("\n Não existe alunos com idade inferior!" );
		}
		}
}
}

		

