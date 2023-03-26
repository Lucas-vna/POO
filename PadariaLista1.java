
package lista1;

public class Padaria{              
            
    Cozinha cozinha = new Cozinha();
    
    //variaveis
    public String nome;
    public String dono;
    public String endereco;
    public float vendasMensais;
    public int qtdeMaxPaes;
    public int qtdeFuncionarios;
    
    
    public Padaria(){ 
        this.nome = " ";
        this.dono = " ";
        this.endereco = " ";
        this.vendasMensais = 0f;
        this.qtdeMaxPaes = 0;
        this.qtdeFuncionarios = 0; 
    }
    
    
    //metodos
    public String getnome(){
        return this.nome;
    }//get nome
    public void setnome(String nome){
        this.nome = nome;
    }//set nome
    
    public String getdono(){
        return this.dono;
    }//get dono
    public void setdono(String dono){
        this.dono = dono;
    }//get dono
    
    public String getendereco(){
        return this.endereco;
    }//get endereco
    public void setendereco(String endereco){
        this.endereco = endereco;
    }//set endereco
    
    public float getvendasMensais(){
        return this.vendasMensais;
    }//get vendas mensais
    public void setvendasMensais(float vendasMensais){
        this.vendasMensais = vendasMensais;
    }//set vendas mensais
    
    public float getqtdeMaxPaes(){
        return this.qtdeMaxPaes;
    }//get vendas mensais
    public void setqtdeMaxPaes(int qtdeMaxPaes){
        this.qtdeMaxPaes = qtdeMaxPaes;
    }//set vendas mensais
    
    public float getqtdeFuncionarios(){
        return this.qtdeFuncionarios;
    }//get vendas mensais
    
    public void setqtdeFuncionarios(int qtdeFuncionarios){
        this.qtdeFuncionarios = qtdeFuncionarios;
    }//get vendas mensais
    
    public int getFuncionarioSort() {
        return (int) (Math.random() * this.qtdeFuncionarios);
    }
    
    @Override
    public String toString(){
        
        return "\n" + "NOME: " + this.nome + "\n" +
                "DONO: " + this.dono + "\n" +
                "ENDERECO " + this.endereco + "\n" +
                "VENDAS MENSAIS: " + this.vendasMensais + "\n" +
                "QUANTIDADE MAX DE PAES " + this.qtdeMaxPaes + "\n" +
                "QUANTIDADE DE FUNCIONARIOS " + qtdeFuncionarios + "\n" +
                "TIPOS DE REFEICAO: " + this.cozinha.tiposRefeicao + "\n" +
                "QUANTIDADE DE PANELAS: " + this.cozinha.qtdePanelas + "\n" +
                "FUNCIONARIO SORTEADO: " + getFuncionarioSort() + "\n"; 
                 
    }
    
    
}
