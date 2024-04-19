package br.com.poo.pooindividual.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

import br.com.poo.pooindividual.entities.Departamento;
import br.com.poo.pooindividual.entities.Funcionario;
import br.com.poo.pooindividual.enums.TipoRegistro;

public class RelatorioIO {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	static DateTimeFormatter dtfBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
		String linha = "";
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				String[] dados = linha.split(";");

				if (dados[0].equalsIgnoreCase(TipoRegistro.FUNCIONARIO.name())) {

					// int id, String nome, LocalDate dataNasc, String email,
					// String cargo, String espec, String cpf,
					// String genero, int fkDep

					Funcionario func = new Funcionario(Integer.parseInt(dados[1]), dados[2],
							LocalDate.parse(dados[3], dtf), dados[4], dados[5], dados[6], dados[7], dados[8],
							Integer.parseInt(dados[9]));

					Funcionario.getMapaFuncionarios().put(Integer.parseInt(dados[1]), func);

					// logger.log(Level.INFO, func::toString);
				} else if (dados[0].equalsIgnoreCase(TipoRegistro.DEPARTAMENTO.name())) {

					// int id, String nome, String areaEspec, String status, String tipo

					Departamento dep = new Departamento(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4],
							dados[5]);

					Departamento.getMapaDepartamentos().put(Integer.parseInt(dados[1]), dep);

					// logger.log(Level.INFO, dep::toString);

				}
			} else {
				break;
			}
		}
		buffRead.close();
	}

	public static void relatorioListaFuncionario(List<String> nomesFuncionarios) throws IOException {
		String nome = "lista-nomes-funcionarios";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));

		buffWrite.append("-------RELATÓRIO: LISTA NOMES DE FUNCIONÁRIOS------\n\n");
		if (!nomesFuncionarios.isEmpty()) {

			buffWrite.append("Nome dos Funcionários: \n\n");
			// Foreach para percorrer a lista de nomes dos funcionários
			for (String nomeFuncionario : nomesFuncionarios) {
				buffWrite.append(nomeFuncionario + "\n");
			}
		}
		LocalDateTime ldt = LocalDateTime.now();
		buffWrite.append("\nData da requisição: " + dtfBr.format(ldt));
		buffWrite.append("\n\n---------FIM DA LISTA NOMES DE FUNCIONÁRIOS--------\n\n");
		buffWrite.close();
	}

	public static void relatorioListaDepartamentos(List<Departamento> departamentos) throws IOException {
		String nome = "lista-Departamentos";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));

		buffWrite.append("-------RELATÓRIO: LISTA DE DEPARTAMENTOS------\n\n");
		if (!departamentos.isEmpty()) {

			buffWrite.append("Departamentos: \n\n");
//Foreach para percorrer a lista de departamentos
			for (Departamento departamento : departamentos) {
				buffWrite.append("Nome: " + departamento.getNome() + "\n" + "Área de especialidade: "
						+ departamento.getAreaEspec() + "\n" + "Tipo: " + departamento.getTipo() + "\n" + "Status: "
						+ departamento.getStatus() + "\n\n");
			}
		}
		LocalDateTime ldt = LocalDateTime.now();
		buffWrite.append("\nData da requisição: " + dtfBr.format(ldt));
		buffWrite.append("\n\n---------FIM DA LISTA DE DEPARTAMENTOS--------\n\n");
		buffWrite.close();
	}

	public static void relatorioListaFuncionarioDepartamento(List<Funcionario> funcionarios,
			List<Departamento> departamentos) throws IOException {
		String nome = "lista-funcionário-departamento";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));

		buffWrite.append("-------RELATÓRIO: LISTA DE FUNCIONÁRIO E DEPARTAMENTO------\n\n");
		if (!funcionarios.isEmpty() && !departamentos.isEmpty()) {
//Foreach para percorrer a lista de departamentos
			for (Funcionario funcionario : funcionarios) {
				for (Departamento departamento : departamentos) {
					if (Objects.equals(funcionario.getFkDep(), departamento.getId())) {

						buffWrite.append("Nome do funcionário: " + funcionario.getNome() + "\nNome do departamento: "
								+ departamento.getNome() + "\n\n");
					}
				}
			}
		}
		LocalDateTime ldt = LocalDateTime.now();
		buffWrite.append("\nData da requisição: " + dtfBr.format(ldt));
		buffWrite.append("\n\n---------FIM DA LISTA DE DEPARTAMENTOS--------\n\n");
		buffWrite.close();
	}
}

/*
 * public static void escritor(String path) throws IOException {
 * 
 * Scanner sc = new Scanner(System.in); Util.customizer();
 * logger.log(Level.INFO, () -> "Escreva o nome do arquivo: "); String nome =
 * sc.nextLine();
 * 
 * BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO +
 * nome + path + EXTENSAO, true)); String linha = "";
 * 
 * Util.customizer(); logger.log(Level.INFO, () -> "Escreva algo: "); linha =
 * sc.nextLine(); buffWrite.append(linha + "\n"); buffWrite.close(); sc.close();
 * 
 * } }
 */
