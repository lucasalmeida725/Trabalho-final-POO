package c1;

public abstract class Peca implements Item{
	protected String descricao;
	protected int quantidade;
	protected int estoqueMinimo;
	protected int estoqueMaximo;

	public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}

public abstract  void venda();

	public void reposicao() {
		 try{if (quantidade < estoqueMinimo) {
			System.out.println("reposicao  concluida:" + descricao + "agora possui:" + quantidade+" "+estoqueMaximo);
		} else if (quantidade == estoqueMaximo) {
			System.out.println("Nao precisa repor");
		}
	}catch (Exception e) {
        System.out.println("Erro ao realizar reposição: " + e.getMessage());
    }
	}

	public String getdescricao() {
		return descricao;
	}

	public int getquantidade() {
		return quantidade;
	}
}
