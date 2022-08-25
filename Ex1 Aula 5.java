/*
   TODO1: Classe Estudante: Crie um construtor sobrecarregado que
           aceite 2 (dois) argumentos diferentes.
   TODO2: Classe Estudante: Crie 2 (dois) métodos sobrecarregados que modificam
           o atributo nome.
   TODO3: Classe Estudante: Utilize o método toString para imprimir o
           estado de execução do objeto.
   TODO4: Classe Estudante: Crie um atributo idade de acesso public.
           Ilustre a chamada desse atributo na classe Principal.
   TODO5: Classe Estudante: Crie um atributo endereco de acesso private.
           Ilustre a chamada desse atributo na classe Principal.
*/

public class Principal {

    public Principal(){
        
        Estudante lucas = new Estudante();//TODO 1
        EStudante luis = new EStudante("LUIS", 20);//TODO 1
        
        System.out.println(joao.idade);//TODO 4
        
    }

    public static void main(String[] args) {
        new Principal();
    }
}

//—------------------------------------------

public class Estudante {
    private String nome;
    public int idade;//TODO 4
    private String endereco;
    
    public Estudante(){
        this.nome="";
    }
    
    public Estudante(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }//TODO 1
    
    public getNome(String nome){
        this.nome = nome;
    }//TODO 2
    
    public void setNome(){
        this.nome = "ESTUDANTE";
    }//TODO 2
    
    public String toString(){
        return this.nome + " " + this.idade;
    }//TODO 3
    
    public String getEndereco(String endereco){
        return this.endereco;
    }
    
}
