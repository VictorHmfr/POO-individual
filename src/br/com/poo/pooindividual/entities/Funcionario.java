package br.com.poo.pooindividual.entities;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Funcionario {
	
	private int id;
	private String nome;
	private LocalDate dataNasc;
	private String email;
	private String cargo;
	private String espec;
	private String cpf;
	private String genero;
	private int fkDep;
	
	
	static Map<Integer, Funcionario> mapaFuncionarios = new HashMap<>();
	
	
	public Funcionario() {
		super();
		
	}
	

	public Funcionario(int id, String nome, LocalDate dataNasc, String email, String cargo, String espec, String cpf,
			String genero, int fkDep) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.email = email;
		this.cargo = cargo;
		this.espec = espec;
		this.cpf = cpf;
		this.genero = genero;
		this.fkDep = fkDep;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEspec() {
		return espec;
	}

	public void setEspec(String espec) {
		this.espec = espec;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getFkDep() {
		return fkDep;
	}

	public void setFkDep(int fkDep) {
		this.fkDep = fkDep;
	}

	public static Map<Integer, Funcionario> getMapaFuncionarios() {
		return mapaFuncionarios;
	}


	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", dataNasc=" + dataNasc + ", email=" + email + ", cargo="
				+ cargo + ", espec=" + espec + ", cpf=" + cpf + ", genero=" + genero + ", fkDep=" + fkDep + "]";
	}
	
	

}
