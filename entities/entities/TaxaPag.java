package entities;

public abstract class TaxaPag {

	private String nome;
	private Double receitaanual;
	
	public TaxaPag () {
	}

	public TaxaPag(String nome, Double receitaanual) {
		super();
		this.nome = nome;
		this.receitaanual = receitaanual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getReceitaanual() {
		return receitaanual;
	}

	public void setReceitaanual(Double receitaanual) {
		this.receitaanual = receitaanual;
	}
	
	public abstract double tax();
	
	
	
}
