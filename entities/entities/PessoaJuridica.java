package entities;

public class PessoaJuridica extends TaxaPag{

	private Integer NumeroEmpregado;
	
	public PessoaJuridica(String nome, Double receitaanual, Integer numeroEmpregado) {
		super(nome, receitaanual);
		NumeroEmpregado = numeroEmpregado;
	}
	public Integer getNumeroEmpregado() {
		return NumeroEmpregado;
	}
	public void setNumeroEmpregado(Integer numeroEmpregado) {
		NumeroEmpregado = numeroEmpregado;
	}

	@Override
	public double tax() {
		/**double NumeroEmpregado = (getNumeroEmpregado() > 10) ? getReceitaanual() * 0.14 : getReceitaanual() * 0.16;
		return NumeroEmpregado;*/
		
		if (NumeroEmpregado > 10) {
			return getReceitaanual() * 0.14;
		}
		else {
			return getReceitaanual() * 0.16;
		}
	}
}
