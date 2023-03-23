//Principal
package heranca;

public class Principal {

    public Principal(){
        
        Calculadora nokia = new Calculadora("NOKIA", "M123");
        
        nokia.imprimir();
        
    }//principal
    
    
    public static void main(String[] args) {
        
        new Principal();
        
    }//main
    
}

//=============================================================================================

//Calculadora

package heranca;

public class Calculadora extends Computador{
    
    public Calculadora(String nome){
        super(nome);
    }
    
    public Calculadora(String nome, String marca){
        super(nome, marca);
    }
    
    @Override
    public void imprimir(){
            
        System.out.println(this.nome + " " +this.marca);
            
    }//imprimir
    
}//class

//=============================================================================================

//Computador
package heranca;

public class Computador {
    
    public String nome;
    public String marca;
    
    public Computador(String nome){
        this.nome=nome;
    }
    public Computador(String nome, String marca){
        this.marca=marca;
        this.nome=nome;
    }
    
    public void imprimir(){
        System.out.print("SUPER CLASSE");
    }
     
}

 
