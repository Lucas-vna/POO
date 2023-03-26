
package lista1;

public class Descobrir{
    
    public Descobrir(){
        
    }
    
    public int getAleatorio(Padaria padaria){
        return (int) (Math.random() * padaria.getqtdeFuncionarios());
    }
    
    
}
