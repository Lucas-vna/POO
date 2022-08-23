package aula;

public class Transportadora {

       public Transportadora(){             

             Veiculo [ ]  vetor = new Veiculo[5];   //Alocacao estatica

            //|_Veiculo_|_Veiculo_|_Veiculo_|_Veiculo_|_Veiculo_|
            vetor[0] = new Veiculo(“caminhao”, 750.0f, 23000f);
            vetor[1] = new Veiculo(“caminhao”, 750.0f, 23000f);

            //Alocacao Dinamica
            List <Veiculo>  lista = new ArrayList<>();   //List é uma interface
            lista.add( new Veiculo(“caminhao”, 750.0f, 23000f) );

             Veiculo caminhao = new Veiculo(“caminhao”, 750.0f, 23000f);
            lista.add( caminhao );              

            for ( Veiculo v : lista)  //Para cada Veiculo da lista,imprime o estado do objeto
                      System.out.println( v );


       }//fim construtor

       public static void main( String [ ] args ){
              new Transportadora();
       }
}//fim classe

//-----------------------------------------------------------------------------------------------

public class Veiculo {

     private String tipo;   //caminhao ou van
     private float precoFrete;
     private float capacidade;

      //Construtor
      public Veiculo(String tipo, float precoFrete, float capacidade){
            cadastrar(tipo, precoFrete, capacidade);
     }

     public void cadastrar(String tipo, float precoFrete, float capacidade){
              this.tipo = tipo;
              this.precoFrete = precoFrete;
              this.capacidade = capacidade;
     }

     public void inserir(float carga){
           if ( capacidade >= carga ) //100 → 50
                  capacidade -= carga;//50 →50
                                      //0            

     }
