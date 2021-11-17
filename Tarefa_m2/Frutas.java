
/*Além disso nosso programa deverá ter opções para:
1/2-Incluir/excluir uma fruta do cadastro.
3-Listar as frutas cadastradas
4-Mostrar os dados de uma fruta escolhida pelo usuário
5-Ler os dados das frutas a serem cadastradas de um arquivo texto de entrada
6-Gravar as frutas cadastradas em um arquivo texto
7-Gravar os objetos em um arquivo (serialização)
8-Ler os objetos de um arquivo (deserialização)*/
package Tarefa_m2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;


public class Frutas {
    private String nome;
    private float peso;
    private float caloria;

    public Frutas vet[];

    public Frutas(){
        vet=new Frutas [2];
    }
    public Frutas(String nome, float peso, float caloria){
        this.nome=nome;
        this.peso=peso;
        this.caloria=caloria;

    }
    public float getCaloria() {
        return caloria;
    }
    public void setCaloria(float caloria) {
        this.caloria = caloria;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String add(String nome, float peso, float caloria){
      Frutas a=new Frutas(nome, peso, caloria);
            for (int i=0; i<vet.length; i++){
                if (vet[i]==null){
                    vet[i]=a;
                    return "OKAY!";
                }
            }
            return "ERROR!";
    }
    
    public String delete(String nome){
        for (int i=0; i<vet.length; i++){
            if (vet[i].getNome().equals(nome)){
                vet[i].setNome(null);
                vet[i].setCaloria(0);
                vet[i].setPeso(0);
                return "Fruta excluida com sucesso ;)";

            }
        }
        return "Fruta não encontrada! :|";
    }
    public void listar(){
        for (int i=0; i<vet.length; i++){
            if (vet[i]!=null){
                System.out.println("\n Fruta= "+vet[i].getNome()+"Peso= "+vet[i].peso+"Caloria= "+vet[i].caloria);
            }
        }
    }
    public void mostrar_fruta(String nome){
        for (int i=0; i<vet.length; i++){
            if (vet[i].getNome().equals(nome)){
                System.out.println("Fruta escolhida: ");
                System.out.println("Nome= "+vet[i].getNome()+" Caloria= "+vet[i].caloria+" Peso= "+vet[i].peso);
            }
        }
    }
    File novo=new File("arquivo.txt");
    public void escrever_arq(){
        try {
      FileWriter f=new FileWriter(novo, true);
      for (int i=0; i<vet.length; i++){
          if (vet[i].getNome()!=null&&vet[i].getCaloria()!=0&&vet[i].getPeso()!=0){
            String caloria=Float.toString(vet[i].caloria);
            String peso=Float.toString(vet[i].peso);
        f.write("\n Nome="+vet[i].getNome()+" Caloria="+caloria+" Peso="+peso);
        }
        }
        System.out.println("Tudo escrito no arquivo!");
        f.close();
    }
    catch (Exception a){
          System.out.println("arquivo nao existe!");
        }
        
    }
    public void ler_arq(){
        try {
        FileReader fr = new FileReader(novo);
        BufferedReader br=new BufferedReader(fr);
            System.out.println("Dados do arquivo!");
        while (br.ready()){
            String linha=br.readLine();
            System.out.println(linha);
        }
        fr.close();
        br.close();
        }
        catch (Exception a){
            System.out.println("arquivo a ser lido nao existe!");
        }
    }
    File arq=new File ("arquivo_objeto.txt");
    public void gravar_arq(){
        try {
            OutputStream out=new FileOutputStream(arq);
            ObjectOutputStream obj=new ObjectOutputStream(out);

            for (int i=0; i<vet.length; i++){
                if (vet[i].getNome()!=null&&vet[i].getCaloria()!=0&&vet[i].peso!=0){
           obj.writeObject("\n"+vet[i].getNome()+" "+vet[i].getPeso()+" "+vet[i].getCaloria());
            }

        }
        System.out.println("Dados gravados em formato binário :)!");;
        obj.close();
        out.close();
    }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

   public void ler_arq2(){
        
    try {
        ObjectInputStream b=new ObjectInputStream(new FileInputStream(arq));
        
        Object obj="";
        int cont=0;

       while (obj!=null){
         obj=b.readObject();
            System.out.println("Dado "+cont+++":"+obj);
           
        }
        b.close();
        }
        catch (Exception a) {
            System.out.println("\n A lista se encerrou ");
        }


   }
    
    public static void main (String args[]){
        Frutas f=new Frutas();

        Scanner ler=new Scanner (System.in);
        int num;
        do {
        System.out.println(" Informe o que deseja fazer :)!");
        System.out.println(" 1- Para inserir frutas                            *  ");
        System.out.println(" 2- Para excluir fruta                              * ");
        System.out.println(" 3- Listar frutas registradas!                      *  ");
        System.out.println(" 4-  Escolher fruta para mostrar dados               * ");
        System.out.println(" 5-  Escrever dados em arquivo texto                  * ");
        System.out.println(" 6-  ler dados em arquivo texto e mostrar no terminal * ");
        System.out.println(" 7-  gravar objeto em arquivo                         * ");
        System.out.println(" 8-  ler objeto em arquivo                            * ");
        System.out.println(" 0-  sair do sistema                                   * ");

        num=ler.nextInt();
        switch (num){
            case 1:
            for (int i=0; i<f.vet.length; i++){
            System.out.print("\n informe o nome da fruta: ");
            String nome=ler.next();
            System.out.print("\n informe a caloria: ");
            float caloria=ler.nextFloat();
            System.out.println("Informe o peso: ");
            float peso=ler.nextFloat();
            System.out.print("\n Inserir:    "+ f.add(nome, peso, caloria));
            }
            break;
        case 2:
        System.out.println("\n Informe o nome da  fruta que deseja excluir. ");
        String nome=ler.next();
        System.out.println(f.delete(nome));
            break;

        case 3:
        System.out.println("Frutas cadastradas!");
        f.listar();
            break;
            
        case 4:
        System.out.println("\n Informe o nome da fruta que deseja ver os dados: ");
        String nome2=ler.next();
        f.mostrar_fruta(nome2);
        break;

        case 5:
        f.escrever_arq();
        break;

        case 6:
        f.ler_arq();
        break;

        case 7:
        f.gravar_arq();
        break;

        case 8:
        f.ler_arq2();
        break;

        case 0:
        System.out.println("Sistema Encerrado!");
        break;
        }
        }while (num!=0);
        ler.close();
    }
   

}
