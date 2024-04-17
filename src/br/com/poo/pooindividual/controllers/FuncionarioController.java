package br.com.poo.pooindividual.controllers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.pooindividual.services.FuncionarioService;
import br.com.poo.pooindividual.util.Util;

public class FuncionarioController {
	
	//instância do serviço do Funcionário, construção do objeto funcionarioService
	FuncionarioService funcService = new FuncionarioService();
	static Logger logger = Util.setupLogger();
	
	public void listarNomesFuncionarios() throws IOException {
		
		//Acessa o método listaNomesFuncionarios da classe FuncionarioService
		List<String> funcionarios = funcService.listaNomesFuncionarios();
		Util.customizer();
		logger.log(Level.INFO, funcionarios + "\n\nLista gerada com sucesso!");
		
		
		
	}
	
	public void listarFuncionarioDepartamento() throws IOException {
		
		funcService.listaFuncionarioDepartamento();
		Util.customizer();
		logger.log(Level.INFO, "\n\nLista gerada com sucesso!");
		
	}

	public void listarNomesFuncionariosCons() throws IOException {
		
		List<String> funcionariosConsole = funcService.listaNomesFuncionariosCons();
		Util.customizer();
		logger.log(Level.INFO, () -> funcionariosConsole.toString().replace("[", " ").replace("]", "").replace(",", "\n\n") + "\n\nLista gerada com sucesso!\n");
		
	}
	
}
