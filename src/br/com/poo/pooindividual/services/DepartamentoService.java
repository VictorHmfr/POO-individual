package br.com.poo.pooindividual.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.pooindividual.entities.Departamento;
import br.com.poo.pooindividual.io.RelatorioIO;

public class DepartamentoService {

	public List<Departamento> listaDepartamentos() throws IOException {
		
		//Cria uma instância de lsita vazia do tipo String
				List<Departamento> listaDepartamentos = new ArrayList<>();
				//Cria um foreach para percorrer o mapa de Pets 
				for(Departamento dep : Departamento.getMapaDepartamentos().values()) {
					//Adiciona o nome do pet na lista listaNomesFuncionarios
					listaDepartamentos.add(dep);
				}
				RelatorioIO.relatorioListaDepartamentos(listaDepartamentos);
				//Retorna a lista listaNomesFuncionarios com todos os nomes dos funcionarios
				return listaDepartamentos;
		
	}
	
}
