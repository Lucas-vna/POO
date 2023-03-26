
package lista1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Padaria> padarias = new ArrayList<>();
        int opcao = 0;
        Padaria padaria = new Padaria();
        
         while (opcao != 3) {
            System.out.println("\n Selecione uma opção:");
            System.out.println("1 - Adicionar padaria");
            System.out.println("2 - Premiar funcionario do mês");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();
            

            switch (opcao) {
                case 1:
                    
                    System.out.print("\n");
                    
                    System.out.print("Informe o nome da padaria: ");
                    padaria.setnome(scanner.next());
                    System.out.print("\n");

                    System.out.print("Informe o nome do dono: ");
                    padaria.setdono(scanner.next());
                    System.out.print("\n");
                    
                    System.out.print("Informe o endereço: ");
                    padaria.setendereco(scanner.next());
                    System.out.print("\n");
                    
                    System.out.print("Informe as vendas mensais: ");
                    padaria.setvendasMensais(scanner.nextFloat());
                    System.out.print("\n");
                    
                    System.out.print("Informe a quantidade máxima de pães: ");
                    padaria.setqtdeMaxPaes(scanner.nextInt());
                    System.out.print("\n");
                    
                    System.out.print("Informe a quantidade de funcionários: ");
                    padaria.setqtdeFuncionarios(scanner.nextInt());
                    System.out.print("\n");
                    
                    System.out.print("Informe a quantidade de tipos de refeições: ");
                    padaria.cozinha.settiposRefeicao(scanner.nextInt());
                    System.out.print("\n");
                    
                    System.out.print("Informe a quantidade de panelas: ");
                    padaria.cozinha.setqtdePanelas(scanner.nextInt());
                    System.out.print("\n");
                    
                    padarias.add(padaria);
                    System.out.println("\n" + "Padaria adicionada com sucesso! ");
                    
                    System.out.println(padaria.toString());
                    
                    break;
                case 2:
                    System.out.print("\n Informe a quantidade de funcionários: ");
                    padaria.setqtdeFuncionarios(scanner.nextInt());
                    System.out.print("\n");
                    
                    System.out.print("FUNCIONARIO SORTEADO: " + padaria.getFuncionarioSort());
                    
                    break;
                case 3:
                    System.out.println("\n" + "Saindo...");
                    break;
                default:
                    System.out.println("ERRO");
            }//SWITCH
            
         }//WHILE

        
             
    }//main
    
}
