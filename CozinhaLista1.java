/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

public class Cozinha {
    
    //variaveis de instancia
    public int tiposRefeicao;
    public int qtdePanelas;
    
    public Cozinha(){
        this.tiposRefeicao = 0;
        this.qtdePanelas = 0;
    }//public cozinha
    
    
    //metodos
    public int gettiposRefeicao(){
        return this.tiposRefeicao;
    }//get refeicao
    public void settiposRefeicao(int tiposRefeicao){
        this.tiposRefeicao = tiposRefeicao;
    }//set refeicao
    
    public int getqtdePanelas(){
        return this.qtdePanelas;
    }//get panelas
    public void setqtdePanelas(int qtdePanelas){
        this.qtdePanelas = qtdePanelas;
    }//set panelas
    
}//public class cozinha
