/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Padaria padaria_A = new Padaria();
        Padaria padaria_B = new Padaria();
        Scanner scanner = new Scanner(System.in);
        Descobrir obj = new Descobrir();
        Estacionamento estacionamento = new Estacionamento();
        
        
        //set padaria A
        System.out.print("Digite o nome da padaria: ");
        padaria_A.setnome(scanner.nextLine());

        System.out.print("Digite o nome da dono: ");
        padaria_A.setdono(scanner.nextLine());

        System.out.print("Digite o endereco: ");
        padaria_A.setendereco(scanner.nextLine());

        System.out.print("Digite as vendas mensais: ");
        padaria_A.setvendasMensais(scanner.nextFloat());

        System.out.print("Digite a quantidade maxima de paes: ");
        padaria_A.setqtdeMaxPaes(scanner.nextInt());

        System.out.print("Digite a quantidade de funcionarios: ");
        padaria_A.setqtdeFuncionarios(scanner.nextInt());

        System.out.print("Digite a quantidade de tipos de refeicoes: ");
        padaria_A.cozinha.settiposRefeicao(scanner.nextInt());

        System.out.print("Digite a quantidade de panelas: ");
        padaria_A.cozinha.setqtdePanelas(scanner.nextInt());
        
        
//        padaria.setnome("Padaria do Wesley");
//        padaria.setdono("Wesley Bailarina");
//        padaria.setendereco("Rua dos Cacetinho");
//        padaria.setvendasMensais(1350.50f);
//        padaria.setqtdeMaxPaes(1200);
//        padaria.setqtdeFuncionarios(15);
//        cozinha.settiposRefeicao(10);
//        cozinha.setqtdePanelas(55);

        System.out.println(obj.aleatorio);
        System.out.println(padaria_A.toString());
        
        
        
    }//main
    
}
