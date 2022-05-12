package cancelamento;

import javax.swing.JOptionPane;

import agendamento.AgendamentoClass;
import medico.MedicoClass;
import principal.Inicio;

public class ConsultaCancelamento {

	public static void ConsCancelamento(String cpf, String data, String horario) {

		for (AgendamentoClass verif_Agendamentos : Inicio.reg_Agendamento) {
			if (verif_Agendamentos.getCpf().equals(cpf) && verif_Agendamentos.getData().equals(data) && verif_Agendamentos.getHorario().equals(horario)) {
				String save1 = "Consulta de Agendamentos\n" + "\nC�digo: " + verif_Agendamentos.getCodigo() + "\nData: "
						+ verif_Agendamentos.getData() + "\nCRM: " + verif_Agendamentos.getCrm() + "\nCPF: "
						+ verif_Agendamentos.getCpf() + "\nStatus: " + verif_Agendamentos.getStatus() + "\nHor�rio: "
						+ verif_Agendamentos.getHorario();
				JOptionPane.showMessageDialog(null, save1, " Consulta de M�dicos ", JOptionPane.PLAIN_MESSAGE);
			}
		}

	}

}
