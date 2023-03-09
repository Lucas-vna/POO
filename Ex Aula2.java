package principal;


public class Principal {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        calculadora.setCampo1(111);
        System.out.println(calculadora.toString());
        
        Calculadora c2 = new Calculadora();
        c2.setCampo1(222);
        System.out.println(c2);

//        calculadora.setCampo1(10);
//        calculadora.setCampo2(20);
//        calculadora.setOperacao(3);
//        calculadora.imprimir();

        Calculadora calculadora1 = new Calculadora();
        Calculadora calculadora2 = new Calculadora();
        
//        calculadora.setMarca("SONY");
        //outro metodo: String marca = new String("SONY");
        //outro metodo: String marca = "SONY";
        //nome da classe - objeto = alocar memoria
       
//        calculadora.setTamanho(1.23f);
        //outro metodo: Float tamanho = new Float(1.23);
        //outro metodo: Float tamanho = 1.23f;
        
//        calculadora.setCor("Vermelho");    
    }//main
    
}//class principal


//----------------------------------------------------------------------------------------------------------------


package principal;

public class Calculadora {
    
    //variaveis de instancia
    public int campo1; //Atributo
    public int campo2; //Atributo
    public int op; //Atributo
    
    //atributos calculadora
    public String marca;
    public String cor;
    public Float tamanho;
    
    //construtor padrao(nao recebe prametros
    public Calculadora(){
        
        this.campo1 = 0;
        this.campo2 = 0;
        this.op = 1;
        this.marca = " ";
        this.cor = " ";
        this.tamanho = 1.23f;
        
    }
    
    
    //marca
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    //cor
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    //tamanho
    public float getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(Float tamanho){
        this.tamanho = tamanho;
    }
    
    
    //metodos
    public void setCampo1(int campo1){
        this.campo1 = campo1;
    }
    public int getCampo1(){
        return this.campo1;
    }
    
    public void setCampo2(int campo2){
        this.campo2 = campo2;
    }
        public int getCampo2(){
        return this.campo2;
    }
        
    public void setOperacao(int op){
        this.op = op;
    }
        public int getOperacao(){
        return this.op;
    }
    
    public void imprimir(){
        
          int resultado=0;
          switch( op ){
                  case 1: {
                      resultado = campo1 + campo2;
                      break;
                  }
                  case 2: {
                       resultado = campo1 - campo2;
                       break;
                   }
                  case 3: {
                       resultado = campo1 * campo2;
                       break;
                   }
                  case 4: {
                       resultado = campo1 / campo2;
                       break;
                   }
                  default:
                  break;
          }//fim switch          

          System.out.println("Resultado: " + resultado);

    }
    
    @Override //passar por cima do comportamento padrao do metodo abaixo
    public String toString(){
        
        return "CAMPO1: " + this.getCampo1() + "/n" +
                "CAMPO2: " + this.getCampo2() + "/n" +
                "Operacao: " + this.getOperacao() + "/n" +
                "Marca: " + this.getMarca() + "/n" +
                "Cor: " + this.getCor() + "/n" +
                "Tamanho: " + this.getTamanho() + "/n";
        
    }//to string
    
}
