package c1;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        Peca[] Item = new Peca[5];
        Item[0] = new RoupaPMG("Camisa", 5, 10, 6, 2, 10);
        Item[1] = new RoupaTamanhoUnico("Saia", 5, 3, 8);
        Item[2] = new Acessorio("Cinto", 5, 3, 8);
        Item[3] = new Acessorio("Pulseira", 5, 3, 8);
        Item[4] = new RoupaPMG("Saida de praia", 2, 10, 4, 7, 4);

        while (true) {
           
            System.out.println("\nEscolha o item para venda:");
            for (int i = 0; i < Item.length; i++) {
                System.out.println(i + " - " + Item[i].getdescricao());
            }
            System.out.println("5 - Sair do sistema");

           
            int opcao = sc.nextInt();
            if (opcao == 5) break;

            
            if (opcao >= 0 && opcao < Item.length) {
               
                Item[opcao].venda();
               
                Item[opcao].reposicao();
            } else {
                System.out.println("Opção inválida.");
            }
        }

       
        System.out.println("\nEstoque final:");
        for (Peca item : Item) {
            System.out.println(item.getdescricao() + ": " + item.getquantidade() + " unidades.");
        }

        sc.close();
    }
}
