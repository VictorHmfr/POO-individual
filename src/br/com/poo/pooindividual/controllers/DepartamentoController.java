package br.com.poo.pooindividual.controllers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.pooindividual.entities.Departamento;
import br.com.poo.pooindividual.services.DepartamentoService;
import br.com.poo.pooindividual.util.Util;

public class DepartamentoController {

	//instância do serviço do Funcionário, construção do objeto funcionarioService
		DepartamentoService depService = new DepartamentoService();
		static Logger logger = Util.setupLogger();
		
		public void listarDepartamentos() throws IOException {
			
			//Acessa o método listaNomesFuncionarios da classe FuncionarioService
			List<Departamento> departamentos = depService.listaDepartamentos();
			Util.customizer();
			logger.log(Level.INFO, departamentos + "\n\nLista gerada com sucesso!");
			
			
			
		}
	
}
