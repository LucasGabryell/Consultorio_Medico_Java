package cancelamento;

import javax.swing.JOptionPane;

import agendamento.AgendamentoClass;
import medico.MedicoClass;
import principal.Inicio;

public class ConsultaCancelamento {

	public static void ConsCancelamento(String cpf, String data, String horario) {

		for (AgendamentoClass verif_Agendamentos : Inicio.reg_Agendamento) {
			if (verif_Agendamentos.getCpf().equals(cpf) && verif_Agendamentos.getData().equals(data) && verif_Agendamentos.getHorario().equals(horario)) {
				String save1 = "Consulta de Agendamentos\n" + "\nCódigo: " + verif_Agendamentos.getCodigo() + "\nData: "
						+ verif_Agendamentos.getData() + "\nCRM: " + verif_Agendamentos.getCrm() + "\nCPF: "
						+ verif_Agendamentos.getCpf() + "\nStatus: " + verif_Agendamentos.getStatus() + "\nHorário: "
						+ verif_Agendamentos.getHorario();
				JOptionPane.showMessageDialog(null, save1, " Consulta de Médicos ", JOptionPane.PLAIN_MESSAGE);
			}
		}

	}

}
