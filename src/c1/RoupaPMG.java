package c1;

import java.util.Scanner;

public class RoupaPMG extends Peca {
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;

    public RoupaPMG(String descricao, int estoqueMinimo, int estoqueMaximo, int quantidadeP, int quantidadeM,
            int quantidadeG) {
        super(descricao, 0, estoqueMaximo, estoqueMinimo);
        this.quantidadeG = quantidadeG;
        this.quantidadeM = quantidadeM;
        this.quantidadeP = quantidadeP;
    }

    public void venda() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o tamanho que voce quer (p/m/g):");
        String tamanho = sc.nextLine();

        switch (tamanho) {
            case "p":
                if (quantidadeP > 0) {
                    quantidadeP--;
                    System.out.println("venda realizada: estoque atual do tamanho p: " + quantidadeP);
                } else {
                    System.out.println("estoque indisponivel para o tamanho p");
                }
                break;
            case "m":
                if (quantidadeM > 0) {
                    quantidadeM--;
                    System.out.println("venda realizada: estoque atual do tamanho m: " + quantidadeM);
                } else {
                    System.out.println("estoque indisponivel para o tamanho m");
                }
                break;
            case "g":
                if (quantidadeG > 0) {
                    quantidadeG--;
                    System.out.println("venda realizada: estoque atual do tamanho g: " + quantidadeG);
                } else {
                    System.out.println("estoque indisponivel para o tamanho g");
                }
                break;
            default:
                System.out.println("tamanho invalido. escolha entre p, m ou g.");
        }
    }

    public void reposicao() {
        if (quantidadeP < estoqueMinimo)
            quantidadeP = estoqueMaximo;
        if (quantidadeM < estoqueMinimo)
            quantidadeM = estoqueMaximo;
        if (quantidadeG < estoqueMinimo)
            quantidadeG = estoqueMaximo;
        System.out.println("reposicao realizada para o item: " + descricao);
    }

    public int getquantidade() {
        return quantidadeP + quantidadeM + quantidadeG;
    }
}
