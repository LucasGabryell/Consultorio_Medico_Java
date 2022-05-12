package Disponivel;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import agendamento.AgendamentoClass;
import principal.Inicio;

public class Disponiveis {

	public static void ConsDisponiveis(String dataConsulta, String crm) {

		ArrayList<String> HorarioManha = new ArrayList<>();
		HorarioManha.add("8");
		HorarioManha.add("9");
		HorarioManha.add("10");
		HorarioManha.add("11");
		HorarioManha.add("12");
		ArrayList<String> HorarioTarde = new ArrayList<>();
		HorarioTarde.add("14");
		HorarioTarde.add("15");
		HorarioTarde.add("16");
		HorarioTarde.add("17");
		HorarioTarde.add("18");

		for (AgendamentoClass reg_Agendadas : Inicio.reg_Agendamento) {
			if (reg_Agendadas.getData().equals(dataConsulta) && reg_Agendadas.getStatus().equals("Agendada")
					&& reg_Agendadas.getCrm().equals(crm)) {
				if (Integer.parseInt(reg_Agendadas.getHorario()) >= 8
						&& Integer.parseInt(reg_Agendadas.getHorario()) <= 12) {
					HorarioManha.remove(reg_Agendadas.getHorario());
				} else {
					HorarioTarde.remove(reg_Agendadas.getHorario());
				}
			}

		}
		JOptionPane.showMessageDialog(null,
				"Data" + "\n\nHorários pela Manhã: " + HorarioManha + "\n Horários pela Tarde" + HorarioTarde);
	}

}
