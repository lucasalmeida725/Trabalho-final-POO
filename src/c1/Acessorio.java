package c1;

import java.util.Scanner;

public class Acessorio extends Peca {
	public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMaximo, estoqueMinimo);
	}

	public void venda() {
		Scanner sc = new Scanner(System.in);
		System.out.println("quantiade de venda :" + descricao + "vendida :");
		int quantidadeVenda = sc.nextInt();
		if (quantidadeVenda <= quantidade) {
			quantidade -= quantidadeVenda;
			System.out.println("venda concluida:" + descricao + "A quantidade agora:" + quantidade);
		} else {
			System.out.println("Estoque insuficiente a reposicao vai ser concluida :");
		}
	}
}
