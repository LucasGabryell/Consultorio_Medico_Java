package agendamento;

import javax.swing.JOptionPane;

import medico.MedicoClass;
import principal.Inicio;

public class ConsultaAgendamento {

	public ConsultaAgendamento() {

		for (AgendamentoClass verif_Agendamentos : Inicio.reg_Agendamento) {
			String save1 = "Consulta de Agendamentos\n" + "\nC�digo: " + verif_Agendamentos.getCodigo() + "\nData: "
					+ verif_Agendamentos.getData() + "\nCRM: " + verif_Agendamentos.getCrm() + "\nCPF: "
					+ verif_Agendamentos.getCpf() + "\nStatus: " + verif_Agendamentos.getStatus() + "\nHor�rio: "
					+ verif_Agendamentos.getHorario();
			JOptionPane.showMessageDialog(null, save1, " Consulta de Cancelamentos ", JOptionPane.PLAIN_MESSAGE);

		}
	}
}
