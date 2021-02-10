package br.com.academia;

import java.time.LocalDate;

import br.com.academia.model.NivelDeAtividade;
import br.com.academia.model.Pessoa;

public class App {


	public static void main(String[] args) {
		
		// PESSOA 1
		
		Pessoa alice = new Pessoa();
		alice.setNome("Alice");
		alice.setSexo('F');
		alice.setPeso(69);
		alice.setAltura(1.68);
		alice.setDataNascimento(LocalDate.of(2001, 1, 8));
		alice.setNivelDeAtividade(NivelDeAtividade.MODERADO);
		
		System.out.println("Nome: "+alice.getNome());
		System.out.println("Idade: " + alice.getIdade());
		System.out.println("Imc: "+ alice.getImc());
		System.out.println("Status: "+ alice.getStatusImc());
		System.out.println("NCD: " + alice.getNcd());
		System.out.println("******************");
		System.out.println("                  ");
		
		
		// PESSOA 2 
		
		Pessoa gustavo =new Pessoa();
		gustavo.setNome("Gustavo");
		gustavo.setSexo('M');
		gustavo.setPeso(50);
		gustavo.setAltura(1.90);
		gustavo.setDataNascimento(LocalDate.of(2000, 3, 26));
		gustavo.setNivelDeAtividade(NivelDeAtividade.MODERADO);
		
		System.out.println("Nome: "+gustavo.getNome());
		System.out.println("Idade: " + gustavo.getIdade());
		System.out.println("Imc: "+ gustavo.getImc());
		System.out.println("Status: "+ gustavo.getStatusImc());
		System.out.println("NCD: " + gustavo.getNcd());
		System.out.println("******************");
		System.out.println("                  ");
		
		// PESSOA 3 
		
		Pessoa maria =new Pessoa();
		maria.setNome("Maria");
		maria.setSexo('F');
		maria.setPeso(69);
		maria.setAltura(1.50);
		maria.setDataNascimento(LocalDate.of(1970, 7, 17));
		maria.setNivelDeAtividade(NivelDeAtividade.MODERADO);
		
		System.out.println("Nome: "+maria.getNome());
		System.out.println("Idade: " + maria.getIdade());
		System.out.println("Imc: "+ maria.getImc());
		System.out.println("Status: "+ maria.getStatusImc());
		System.out.println("NCD: " + maria.getNcd());
		System.out.println("******************");
		System.out.println("                  ");
		
		
		// PESSOA 4
		
		Pessoa antonio =new Pessoa();
		antonio.setNome("Antonio");
		antonio.setSexo('M');
		antonio.setPeso(59);
		antonio.setAltura(1.69);
		antonio.setDataNascimento(LocalDate.of(1960, 5, 28));
		antonio.setNivelDeAtividade(NivelDeAtividade.MODERADO);
		
		System.out.println("Nome: "+antonio.getNome());
		System.out.println("Idade: " + antonio.getIdade());
		System.out.println("Imc: "+ antonio.getImc());
		System.out.println("Status: "+ antonio.getStatusImc());
		System.out.println("NCD: " + antonio.getNcd());
		System.out.println("******************");
		System.out.println("                  ");
				

		
	}
	
	
	
}
