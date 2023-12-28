package entities;

public class PessoaFisica extends TaxaPag {

	private Double gastoSaude;
	
	public PessoaFisica(String nome, Double receitaanual, Double gastoSaude) {
		super(nome, receitaanual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double tax() {
		
		double ImpostBasic = (getReceitaanual() < 20000) ? getReceitaanual() * 0.15 : getReceitaanual() * 0.25;
		
		/**Double ImpostBasic;
		if (getReceitaanual() < 20000 ) {
			ImpostBasic = getReceitaanual() * 0.15;
		}
		else {
			ImpostBasic = getReceitaanual() * 0.25;
		}*/
		
		ImpostBasic = ImpostBasic - (getGastoSaude() * 0.5);
		if(ImpostBasic < 0.0) {
			return 0.0;
		}
		return ImpostBasic;
	}

}
