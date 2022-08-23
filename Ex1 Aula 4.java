
package aula;



public class Floricultura {

    public Floricultura(){
        Flor rosa = new Flor();
        Flor margarida = new Flor();
        
        rosa.cadastrar("rosa");
        //rosa.setTipo("rosa");
        
        margarida.cadastrar("margarida");
        margarida.setTipo("margarida");
        margarida.modificar("amarela", "margarida", 20f);
        
        Flor violeta = new Flor("violeta", "azul", "VIOLETA", 50f);
    }
    
    
    public static void main(String[] args) {
        new Floricultura();
    }
    
}

//-------------------------------------------------------------------------


package aula;


public class Flor {
    
    //atributos
    private String tipo;
    private String cor;
    private String nome;
    private Float preco;
    
    //sobrecarga
    public Flor(String tipo, String cor, String nome, float preco){
        setTipo(tipo);
        setCor(cor);
        setNome(nome);
        setPreco(preco);
    }
    
    public Flor(){
        setTipo("rosa");
        setCor("vermelha");
        setNome("rosa");
        setPreco(0);
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(Float preco){
        this.preco = preco;
    }
    
    public void cadastrar(String tipo){
        this.tipo = tipo;
        //SetTipo(tipo); 
    }
    
    public void modificar(String cor, String nome, float preco){  
        setCor(cor);
        setNome(nome);
        setPreco(preco);
    }
   
}
