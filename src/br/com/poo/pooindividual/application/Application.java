package br.com.poo.pooindividual.application;

import java.io.IOException;
import java.util.Scanner;

import br.com.poo.pooindividual.io.RelatorioIO;
import br.com.poo.pooindividual.services.FuncionarioService;
import br.com.poo.pooindividual.services.MenuService;

public class Application {

	// public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		// FuncionarioService funcService = new FuncionarioService();

		RelatorioIO.leitor("banco");
		MenuService.menu();
		// RelatorioIO.escritor("banco");
		// RelatorioIO.relatorioListaDepartamentos(null));
		// RelatorioIO.relatorioListaFuncionario(funcService.listaNomesFuncionarios());
		// sc.close();

	}

}
