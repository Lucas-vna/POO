/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

public class Estacionamento {
    
    public String tipoVeiculo;
    public String placa;
    public int horarioEntrada;//em minutos
    public int horarioSaida;//em minutos
    public int horarioTotal;
    public int preco;
    
    
    public Estacionamento(){
        this.tipoVeiculo = " ";
        this.placa = " ";
        this.horarioEntrada = 0;
        this.horarioSaida = 0;
        this.preco = 0;
        this.horarioTotal = horarioSaida - horarioEntrada;
    }
    
    
    public String gettipoVeiculo(){
        return this.tipoVeiculo;
    }
    public void settipoVeiculo(String tipoVeiculo){
        this.tipoVeiculo = tipoVeiculo;
    }
    
    public String getplaca(){
        return this.placa;
    }
    public void setplaca(String placa){
        this.placa = placa;
    }
    
    public int gethorarioEntrada(){
        return this.horarioEntrada;
    }
    public void sethorarioEntrada(int horarioEntrada){
        this.horarioEntrada = horarioEntrada;
    }
    
    public int gethorarioSaida(){
        return this.horarioEntrada;
    }
    public void sethorarioSaida(int horarioSaida){
        this.horarioSaida = horarioSaida;
    }
    
    public void sethorarioTotal(int horarioTotal){
        this.horarioTotal = horarioTotal;
    }
    
    
//    if(horarioTotal <= 30){
//        this.preco = 0;
//    } else if (horarioTotal > 30 && horarioTotal <= 60){
//        this.preco = 10;
//    } else if (){
//    
    
    
}
