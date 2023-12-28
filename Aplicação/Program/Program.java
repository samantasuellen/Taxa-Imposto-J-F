package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.TaxaPag;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxaPag>list = new ArrayList<TaxaPag>();
		
		System.out.print("Entrar com quantos colaboradores: ");
		int N =sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.println("Taxa pagamento #" + i + ": ");
			System.out.print("A pessoa é Fisica ou Juridica: (F/J): ");
			char type = sc.next().charAt(0);
			System.out.println("nome: ");
			String nome = sc.next();
			System.out.println("Valor anual: ");
			Double receitaanual = sc.nextDouble();
			
			if (type == 'F') {
				System.out.println("Gastos com saude: ");
				Double gastoSaude = sc.nextDouble();
				PessoaFisica x = new PessoaFisica(nome, receitaanual, gastoSaude);
				list.add(x);
			}
			else {
				System.out.println("Numero de empregaodos: ");
				Integer numeroEmpregado = sc.nextInt();
				list.add(new PessoaJuridica(nome, receitaanual, numeroEmpregado));
			}
			
		}
		System.out.println();
		System.out.println("pagamento de taxa: ");
		for (TaxaPag tp : list) {
			System.out.printf( tp.getNome() + " $ " + String.format("%.2f", tp.tax()));
		}
		double sum = 0.0;
		for(TaxaPag tp : list) {
			sum +=tp.tax();
		}
		System.out.println(" Total de taxa: " + String.format("%.2f", sum));
		
		sc.close();
	}

}
