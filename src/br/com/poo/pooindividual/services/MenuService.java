package br.com.poo.pooindividual.services;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.pooindividual.controllers.DepartamentoController;
import br.com.poo.pooindividual.controllers.FuncionarioController;
import br.com.poo.pooindividual.util.Util;

public class MenuService {
	
	
	static Logger logger = Util.setupLogger();
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() throws IOException {
		FuncionarioController funcController = new FuncionarioController();
		DepartamentoController depController = new DepartamentoController();
		Util.customizer();
		logger.log(Level.INFO, () -> ""
					+ "Menu interativo:"
					+ "\n[1]\tListar Nomes dos Funcionários"
					+ "\n[2]\tListar Departamentos"
					+ "\n[3]\tListar os Funcionários e seus Departamentos"
					+ "\n[4]\tCadastras Funcionários"
					+ "\n[0]\tSair"
					+ "\n\nDigite uma opção: ");
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			Util.customizer();
			logger.log(Level.INFO, "Lista Nomes dos Funcionários");
			funcController.listarNomesFuncionarios();
			logger.log(Level.INFO, "\n\n");
			menu();
			
			break;
		case 2:
			Util.customizer();
			logger.log(Level.INFO, "Lista de Departamentos");
			depController.listarDepartamentos();
			logger.log(Level.INFO, "\n\n");
			menu();
			
			
			break;
		case 3:
			Util.customizer();
			logger.log(Level.INFO, "Lista de Funcionários e seus Departamentos");
			funcController.listarFuncionarioDepartamento();
			logger.log(Level.INFO, "\n\n");
			menu();
			
			break;
		case 4:
			
			break;
		case 0:
			Util.customizer();
			logger.log(Level.INFO, "Volte sempre!");
			break;
		default:
			Util.customizer();
			logger.log(Level.INFO, "Opção inválida!");
			menu();
			break;
		}
	}

}
