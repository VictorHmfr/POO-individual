package br.com.poo.pooindividual.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.pooindividual.entities.Departamento;
import br.com.poo.pooindividual.entities.Funcionario;
import br.com.poo.pooindividual.io.RelatorioIO;
import br.com.poo.pooindividual.util.Util;

public class FuncionarioService {

	static Logger logger = Util.setupLogger();

	// Método que retorna uma lista do tipo String
	public List<String> listaNomesFuncionarios() throws IOException {
		// Cria uma instância de lsita vazia do tipo String
		List<String> listaNomesFuncionarios = new ArrayList<>();
		// Cria um foreach para percorrer o mapa de Pets
		for (Funcionario func : Funcionario.getMapaFuncionarios().values()) {
			// Adiciona o nome do pet na lista listaNomesFuncionarios
			listaNomesFuncionarios.add(func.getNome());
		}
		RelatorioIO.relatorioListaFuncionario(listaNomesFuncionarios);
		// Retorna a lista listaNomesFuncionarios com todos os nomes dos funcionarios
		return listaNomesFuncionarios;
	}

	public void listaFuncionarioDepartamento() throws IOException {
		DepartamentoService departamentoService = new DepartamentoService();
		RelatorioIO.relatorioListaFuncionarioDepartamento(listaFuncionarios(),
				departamentoService.listaDepartamentos());
	}

	// Método que retorna uma lista do tipo String
	public List<Funcionario> listaFuncionarios() throws IOException {
		// Cria uma instância de lsita vazia do tipo String
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		// Cria um foreach para percorrer o mapa de Pets
		for (Funcionario func : Funcionario.getMapaFuncionarios().values()) {
			// Adiciona o nome do pet na lista listaNomesFuncionarios
			listaFuncionarios.add(func);
		}

		// Retorna a lista listaNomesFuncionarios com todos os nomes dos funcionarios
		return listaFuncionarios;
	}

	public List<String> listaNomesFuncionariosCons() throws IOException {

		List<String> listaNomesFuncionariosCons = new ArrayList<>();

		for (Funcionario func : Funcionario.getMapaFuncionarios().values()) {

			listaNomesFuncionariosCons.add(func.getNome());
		}

		return listaNomesFuncionariosCons;
	}

	public List<String> listaFuncionarioDepartamentoCons() throws IOException {

		List<String> listaFuncionarioDepartamentoCons = new ArrayList<>();
		Map<Integer, Departamento> deps = Departamento.getMapaDepartamentos();
		for (Map.Entry<Integer, Funcionario> setFuncionario : Funcionario.getMapaFuncionarios().entrySet()) {

			logger.log(Level.INFO, setFuncionario.getValue().getNome() + " = "
					+ deps.get(setFuncionario.getValue().getFkDep()).getNome());
		}
		/*
		 * for (Funcionario func : Funcionario.getMapaFuncionarios().values()) { for
		 * (Departamento dep : Departamento.getMapaDepartamentos().values()) { if
		 * (func.getFkDep() == dep.getId()) {
		 * listaFuncionarioDepartamentoCons.add(func.getNome());
		 * 
		 * } } }
		 */
		// DepartamentoService departamentoService = new DepartamentoService();
		return listaFuncionarioDepartamentoCons;

	}

}
