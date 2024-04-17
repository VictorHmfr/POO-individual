package br.com.poo.pooindividual.services;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.pooindividual.util.Util;

public class MenuService {
	
	
	static Logger logger = Util.setupLogger();
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() throws IOException {
		Util.customizer();
		logger.log(Level.INFO, () -> ""
					+ "Menu interativo:"
					+ "\n[1]\tImpresso"
					+ "\n[2]\tConsole"
					+ "\n[0]\tSair"
					+ "\n\nDigite uma opção: ");
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			SubMenuService.subMenuImpresso();
			break;
		case 2:
			SubMenuService.subMenuConsole();
					
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
