package c1;

public class RoupaTamanhoUnico extends Peca {
	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMaximo, estoqueMinimo);
	}

	public void venda() {
		if (quantidade > 0) {
			quantidade--;
			System.out.println("Venda realiza:" + descricao + "a quantiade atual:" + quantidade);
		} else {
			System.out.println("Estoque insuficiente");
		}
	}
}
