public class Loja {

    public void iniciar(){
            List<Calcado> lista = new ArrayList<>();
            
            Scanner entrada = new Scanner(System.in);
            String marca = entrada.next();  //Le uma String
            float tamanho = entrada.nextFloat(); 
            float valor = entrada.nextFloat();
           
            lista.add (  new Calcado( marca, tamanho, valor ) );  
    }

     public Loja(){

          iniciar();
     }

     public static void main( String [ ] args ){
              new Loja();
      }
}

//—---------------------------------------------------------------------------------

public class Calcado {

        //Atributos
       private String marca;
       private float tamanho;
       private float valor;

       public Calcado(String marca, float tamanho, float valor){
               this.marca = marca;
               this.tamanho=tamanho;
               this.valor=valor;
       }


      public String toString(){

             return “Marca: “+this.marca + “\n” +
                         “Tamanho: “+this.tamanho + “\n” +
                         “Valor: “ + this.valor;
     }
}
