package br.com.poo.pooindividual.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.pooindividual.entities.Departamento;
import br.com.poo.pooindividual.io.RelatorioIO;

public class DepartamentoService {

	public List<Departamento> listaDepartamentos() throws IOException {
		
		//Cria uma instância de lista vazia do tipo String
				List<Departamento> listaDepartamentos = new ArrayList<>();
				//Cria um foreach para percorrer o mapa de departamentos
				for(Departamento dep : Departamento.getMapaDepartamentos().values()) {
					//Adiciona o nome do departamento na lista listaNomesFuncionarios
					listaDepartamentos.add(dep);
				}
				RelatorioIO.relatorioListaDepartamentos(listaDepartamentos);
				//Retorna a lista listaNomesFuncionarios com todos os nomes dos funcionarios
				return listaDepartamentos;
		
	}
	
		public List<Departamento> listaDepartamentosConsole() throws IOException {
		
				List<Departamento> listaDepartamentos = new ArrayList<>();
				for(Departamento dep : Departamento.getMapaDepartamentos().values()) {
					listaDepartamentos.add(dep);
				}
				
				return listaDepartamentos;
		
	}
	
}
