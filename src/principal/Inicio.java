package principal;

import java.util.ArrayList;

import Pronturario.ClassProntuarios;
import agendamento.AgendamentoClass;
import medico.MedicoClass;
import paciente.PacienteClass;
import telas.ClassCadastro;
import telas.TelaPrincipal;

public class Inicio {

	public static ArrayList<ClassCadastro> reg_Cadastro = new ArrayList<>();
	public static ArrayList<MedicoClass> reg_Medico = new ArrayList<>();
	public static ArrayList<PacienteClass> reg_Paciente = new ArrayList<>();
	public static ArrayList<AgendamentoClass> reg_Agendamento = new ArrayList<>();
	public static ArrayList<ClassProntuarios> reg_Prontuarios = new ArrayList<>();
	public static int cont = 1;

	public static void main(String[] args) {

		TelaPrincipal tela = new TelaPrincipal();
		tela.setVisible(true);
	}
}
