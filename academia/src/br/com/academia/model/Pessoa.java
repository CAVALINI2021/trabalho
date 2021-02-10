package br.com.academia.model;

import java.time.LocalDate;
import java.time.Period;


public class Pessoa {
	
	private String nome;
	private double peso;
	private double altura;
	private char sexo;
	private NivelDeAtividade  nivelDeAtividade;
	private LocalDate dataNascimento;
	
	// NOME
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	//PESO

	public  void setPeso(double peso) {
		 this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	
	// ALTURA 
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return this.altura;
	} 
	
	// SEXO
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void getSexo(char sexo) {
		this.sexo = sexo;
	}
	
	// nivelDeAtividade 
	
	public void setNivelDeAtividade(NivelDeAtividade nivelDeAtividade) {
		this.nivelDeAtividade = nivelDeAtividade;
	}
	public NivelDeAtividade getNivelDeAtividade() {
		return nivelDeAtividade;
	}
	
	// DATA DE NASCIMENTO 
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	} 
	
	// IDADE
	
	public int getIdade() {
		LocalDate hoje = LocalDate.now();
		Period period = Period.between(this.dataNascimento, hoje);
		return period.getYears();
		}
	
	// CALCULO IMC
	
	public double getImc() {
		return this.peso / Math.pow(this.altura, 2);
	}
	
	public String getStatusImc () {
		
		if (this.getImc() < 18.5) {
			return "Abaixo do Peso";
		}else if (this.getImc() > 18.5 && this.getImc() < 25) {
			return "Peso Ideal";
		}else if (this.getImc() >25 && this.getImc() <29.9) {
			return "Sobrepeso";
		}else if (this.getImc() >29.9 && this.getImc() <34) {
			return "Obesidade grau 1";
		}else if (this.getImc() >34 && this.getImc() <39.9) {
			return "Obesidade grau 2";
		}else {
			return "Obesidade M�rbida";
		}
		
	}

	
	
	// CALCULO NCD
	
	public double getNcd() {
		double ncd =0;
		
		// FEMININO OU MASCULINO 
		
		if (this.sexo == 'M') 
		
			// IDADE
			if (this.getIdade() >= 18 && this.getIdade() < 31 ) {
				ncd = 15.3 * this.peso + 679;
			} else if (this.getIdade() >= 31 && this.getIdade() <= 60 ) {
				ncd = 11.6 * this.peso + 879;
			} else {
				ncd = 13.5 * this.peso + 487;	
			}
			
			// ATIVIDADE FISICA
			if (this.nivelDeAtividade == NivelDeAtividade.LEVE) {
				ncd *= 1.5;
			}
			if (this.nivelDeAtividade== NivelDeAtividade.MODERADO ) {
				ncd *= 1.8;
			}
			if (this.nivelDeAtividade== NivelDeAtividade.INTENSO ) {
				ncd *= 2.1;
			}
			
			
			//**********************************************************************
			
			
			if (this.sexo == 'F') {
				
				// IDADE
				if (this.getIdade() >= 18 && this.getIdade() < 31 ) {
					ncd = 14.7 * this.peso + 496;
				} else if (this.getIdade() >= 31 && this.getIdade() <= 60 ) {
					ncd = 8.7 * this.peso + 829;
				} else {
					ncd = 10.5 * this.peso + 596;	
				}
				
				// ATIVIDADE FISICA
				if (this.nivelDeAtividade == NivelDeAtividade.LEVE) {
					ncd *= 1.6;
				}
				if (this.nivelDeAtividade == NivelDeAtividade.MODERADO ) {
					ncd *= 1.6;
				}
				if (this.nivelDeAtividade == NivelDeAtividade.INTENSO ) {
					ncd *= 1.8;
				}	
			
		  }
		
			return ncd;
			
	}
		
}	


		
			
			
			
			
			
