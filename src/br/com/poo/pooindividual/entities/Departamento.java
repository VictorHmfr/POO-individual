package br.com.poo.pooindividual.entities;

public class Departamento {

	private int id;
	private String nome;
	private String areaEspec;
	private String status;
	private String tipo;
	
	public Departamento() {
		super();
	
	}

	public Departamento(int id, String nome, String areaEspec, String status, String tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.areaEspec = areaEspec;
		this.status = status;
		this.tipo = tipo;
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

	public String getAreaEspec() {
		return areaEspec;
	}

	public void setAreaEspec(String areaEspec) {
		this.areaEspec = areaEspec;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
	
}
