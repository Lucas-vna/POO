/*
Utilize o código-fonte do exercício anterior. No mesmo projeto: 
Implemente uma Classe Notas que leia 3 (três) notas e retorne a menor nota. Dica: utilize o método static Math.min
*/

import java.util.Scanner;

public class Notas {
     private float [] notas;

     public Notas {
          notas = new notas[3];   //vetor estatico
     }

     public float lerNotas(){
             Scanner entrada = new Scanner(System.in);
             
             for(int i = 0; i < notas.length; i++){
                   System.out.println(“\nNota “ + i );
                   notas[i] = entrada.nextFloat();
             } 

             float minimo = Math.min(notas[0],notas[1]);
             minimo = Math.min(minimo,notas[2]);
             return minimo;
     }//lerNotas
}//Notas
