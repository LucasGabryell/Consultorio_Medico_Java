package Pronturario;

import javax.swing.JOptionPane;

import principal.Inicio;

public class ConsultaProntuarios {
	
	public ConsultaProntuarios() {
		for (ClassProntuarios verif_prontuarios : Inicio.reg_Prontuarios) {
			String save1 = "Consulta de M�dicos Cadastrados\n" + "\nCRM: " + verif_prontuarios.getCrm() + "\nCPF: "
					+ verif_prontuarios.getCpf() + "\nAtendimento: " + verif_prontuarios.getAtendimento() + "\nMedicamentos: "
					+ verif_prontuarios.getMedicamentos() ;
			JOptionPane.showMessageDialog(null, save1, " Consulta de Prontu�rios ", JOptionPane.PLAIN_MESSAGE);
		}

	}

}
