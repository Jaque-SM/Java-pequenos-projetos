/*Foram fornecidos matrícula, nome e idades e alturas de 5 alunos. Faça um Programa que determine quantos
alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.

- Crie uma classe Aluno

- Crie um vetor de objetos da classe Aluno*/


	public class Aluno {
	private int matricula, idade;
	private String nome;
	private float altura;
	
	public int getMatricula() {
	return matricula;
	
}
	public int getIdade() {
	return idade;
}
	public float getAltura(int i) {
	return altura;
}
	public String nome() {
	return nome;
	}
	public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
	
	
	
}

	
	

