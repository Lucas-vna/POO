/*
Utilize o código-fonte do exercício anterior. No mesmo projeto:
Implemente uma Classe Temperatura que realize a conversão de temperatura de graus Celsius para graus Fahrenheit, e vice-versa, de acordo com as seguintes fórmulas:

celsius = 5.0 / 9.0 * (fahrenheit - 32 )

fahrenheit = 9.0 / 5.0 * celsius + 32
*/

public class Temperatura {

     private float temperatura;

     public void celsiusFah(float celsius) {
                 temperatura = 9.0 / 5.0 * celsius + 32;
     }
     public void fahCelsius(float fah){
           temperatura = 5.0 / 9.0 * (fah - 32 );
     }

}
